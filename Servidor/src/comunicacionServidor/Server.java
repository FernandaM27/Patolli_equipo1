package comunicacionServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author jc
 */
public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Server().run();
    }

    public void run() throws IOException, ClassNotFoundException {
        Socket socket = null;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;

        try {
            ServerSocket serverSocket = null;
            serverSocket = new ServerSocket(4444);
            System.out.println("Listo para conectarse");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new HiloSocket(clientSocket).start();
                System.out.println("Conectado");
            }           
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }
    }
}

