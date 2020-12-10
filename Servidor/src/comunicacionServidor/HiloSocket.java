/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jc
 */
public class HiloSocket extends Observable implements Runnable {

    private Socket socket;
    private ServerSocket serverSocket;
    private Server server;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    boolean salir = true;

    public HiloSocket(ServerSocket serverSocket, Server server) {
        this.serverSocket = serverSocket;
        this.server = server;
    }

    @Override
    public void run() {
        this.escuchar();
    }
    
    public void escuchar(){
        try {
            System.out.println("SSINSAS");
            this.socket=null;
            this.socket = serverSocket.accept();
            HiloSocket hiloSocket = new HiloSocket(serverSocket, server);
            new Thread(hiloSocket).start();
            in = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());
            while (true) {
                try {
                    Object object;
                    if ((object = in.readObject()) != null) {
                        this.notificarServer(object);
                    } else {
                        ///Dejar ....
                        System.out.println("sss");
                    }
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void notificarServer(Object objet) {
        this.server.update(this, objet);
    }

    public void notificarCliente(String mensaje) throws IOException {
        this.out.writeObject(mensaje);
    }

}
