/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionCliente;

import entidades.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI GF63
 */
public class ClienteSocket extends Observable implements Runnable {

    private ObjectInputStream in;
    private ObjectOutputStream out;
    private Socket cliente;
    private String ip;
    private Comunicacion comunicacion;

    public ClienteSocket(String ip, Comunicacion comunicacion) {
        this.ip = ip;
        this.comunicacion = comunicacion;
    }

    public void conectar(String ip) throws IOException {
        if (this.cliente == null) {
            this.cliente = new Socket(ip, 4444);
            out = new ObjectOutputStream(cliente.getOutputStream());
            in = new ObjectInputStream(cliente.getInputStream());
            Object object = null;
            try {
                object = in.readObject();
            } catch (Exception e) {
                System.out.println("Error al leer");
            }
            if (object != null) {
                comunicacion.notificarCliente((String) object);
            }
        }
        while (true) {
            try {
                Object obj;
                if ((obj = in.readObject()) != null) {
                    //usar el update
                    this.comunicacion.notificarCliente((String) obj);
                }
            } catch (Exception e) {
                System.out.println("ERRROR al conectar");
            }
        }
    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//     
//    }

    @Override
    public void run() {
        try {
            this.conectar(ip);
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviar(Partida partida) throws IOException {
        if (cliente.isConnected()) {
            out.writeObject(partida);
        }
    }

}
