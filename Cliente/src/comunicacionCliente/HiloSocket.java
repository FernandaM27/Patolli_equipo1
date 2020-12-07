/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionCliente;

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

    Socket socket;

    @Override
    public void run() {

        try {
            ObjectOutputStream out = null;
            ObjectInputStream in = null;
            String ip;

            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());           
            

            

            out.close();
            in.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(HiloSocket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public HiloSocket(Socket socket) {
        this.socket = socket;
    }

}
