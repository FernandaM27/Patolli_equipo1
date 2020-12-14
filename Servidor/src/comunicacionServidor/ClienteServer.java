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
public class ClienteServer extends Thread {

    private Socket socket;
    private Server server;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    boolean shouldRun = true;

    public ClienteServer(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
        this.inicializar();
    }

    public void inicializar() {
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
//            out = new PrintWriter(socket.getOutputStream(), true);
//            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //si no jala agregarlo a la lista inicializarlo aquí
        } catch (IOException ex) {
            Logger.getLogger(ClienteServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        this.escuchar();
    }

    public void escuchar() {
        try {
            Object obj;
            while (shouldRun) {
                try {
                    if ((obj = in.readObject()) != null) {

//                        if(server.consultarColor()){
//                            Casa casa= (Casa)obj;
//                            server.setColor(casa.getColor());
//                            this.avisarClientes(obj);
//                        }else{
//                            Casa casa= new Casa(server.getColor());
//                            this.avisarCliente(casa);
//                        }
                          server.enviarInstancia(obj);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClienteServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    private void notificarServer(Object objet) {
//        this.server.update(this, objet);
//    }
    
    public void avisarCliente(Object obj) {
        try {
            //out.println(obj.trim().toUpperCase());
            out.writeObject(obj);
        } catch (IOException ex) {
            Logger.getLogger(ClienteServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
