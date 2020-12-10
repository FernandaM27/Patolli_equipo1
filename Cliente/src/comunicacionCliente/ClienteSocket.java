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
public class ClienteSocket extends Thread {

    private Socket socket = null;
    private ObjectOutputStream out = null;
    private ObjectInputStream in = null;
    @Override
    public void run() {

        try {
            socket = new Socket("localhost", 3312);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
            while (true) {
              
                break;
            }
            out.close();
            in.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
