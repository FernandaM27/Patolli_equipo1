package comunicacionServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import modelo.ModeloPartida;

/**
 *
 * @author jc
 */
public class Server{

    List<ClienteServer> clientes;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Server();
    }

    public Server() {
        this.clientes = new ArrayList<>();
        ServerSocket servidor;
        try {
            servidor = new ServerSocket(4000);
            System.out.println("Listo para conectarse......");
            while (true) {
                Socket cliente = new Socket();
                cliente = servidor.accept();
                ClienteServer clienteServer = new ClienteServer(cliente, this);
                clienteServer.start();
                System.out.println("Hilo Conectado");
                clientes.add(clienteServer);
            }
        } catch (IOException ex) {
            System.out.println("Error en Server");
        }
    }

    public List<ClienteServer> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteServer> clientes) {
        this.clientes = clientes;
    }

    String color = null;

    public boolean consultarColor() {
        return color == null;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
