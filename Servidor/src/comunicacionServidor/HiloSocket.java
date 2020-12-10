/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jc
 */
public class HiloSocket extends Thread {

    private Protocolo protocol = new Protocolo(this);
    Socket socket;
    boolean salir=true;

    @Override
    public void run() {
        try {
            ObjectOutputStream out = null;
            ObjectInputStream in = null;

            if (protocol.hilo.salir == false) {
                out.close();
                in.close();
                socket.close();
            }
            out = new ObjectOutputStream(socket.getOutputStream());
            //revisar como enviar apartir del protocolo
            //in = new ObjectInputStream(socket.getInputStream());

            while (in.readBoolean()) {
                protocol.processInput(in.readObject());
            }
            this.run();
        } catch (IOException ex) {
            Logger.getLogger(HiloSocket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HiloSocket(Socket socket) {
        this.socket = socket;
    }

}
