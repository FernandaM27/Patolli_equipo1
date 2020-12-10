package comunicacionServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import modelo.ModeloPartida;

/**
 *
 * @author jc
 */
public class Server implements Observer {
    private Protocolo protocolo;
    private List<HiloSocket>clientes;

    
    public Server(){
        this.protocolo= new Protocolo(this);
        escuchar();
    }
    
    private void escuchar() {
         try{
             HiloSocket cliente = new HiloSocket(new ServerSocket(4444), this);
             System.out.println("Llega aquí");
             cliente.addObserver(this);
             new Thread(cliente).start();
         }catch(Exception e){
             
         }
          
    }

    @Override
    public void update(Observable o, Object in) {
        this.protocolo.processInput(in);
    }

    public void notificarCliente(String mensaje) throws IOException{
        for (HiloSocket cliente : clientes) {
            cliente.notificarCliente(mensaje);
        }
    }


}
