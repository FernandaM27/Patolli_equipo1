/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionCliente;

import entidades.Jugador;
import entidades.Movimiento;
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
    private String ip = "localhost";
    private Comunicacion comunicacion;
    /**
     * 
     * @param ip
     * @param comunicacion 
     */
    public ClienteSocket(Comunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }
    /**ç
     * metodo que se encarga de conectar el cliente con el servidor 
     * @param ip
     * @throws IOException 
     */
    public void conectar() throws IOException {
        if (this.cliente == null) {
            this.cliente = new Socket(ip, 4444);
            out = new ObjectOutputStream(cliente.getOutputStream());
            in = new ObjectInputStream(cliente.getInputStream());
            Object object = null;
//            try {
//                object = in.readObject();
//            } catch (Exception e) {
//                System.out.println("Error al leer");
//            }
//            if (object != null) {
//                comunicacion.notificarCliente((String) object);
//            }
        }
        while (true) {
            try {
                Partida partida;
                if ((partida = (Partida)in.readObject()) != null) {
                    //usar el update
                    this.comunicacion.actualizarModelo(partida);
                }
            } catch (Exception e) {
                System.out.println("Error al escuchar");
            }
        }
    }
 
    /**
     * 
     */
    @Override
    public void run() {
        try {
            this.conectar();
        } catch (IOException ex) {
            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /*
      Se que pidieron quedar en uno pero #FaltaDeTiempo
     --------------------------------------------------
        
    */
    
    /**
     * Se que
     * @param partida
     * @throws IOException 
     */
    public void enviarPartida(Partida partida) throws IOException {
        if (cliente.isConnected()) {
            out.writeObject(partida);
        }
    }
    
    public void enviarMovimiento(Movimiento movimiento) throws IOException {
        if (cliente.isConnected()) {
            out.writeObject(movimiento);
        }
    }
    
    public void enviarJugador(Jugador jugador) throws IOException {
        if (cliente.isConnected()) {
            out.writeObject(jugador);
        }
    }
    

}
