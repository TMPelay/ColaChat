package conexion;

import interfaz.Main;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor extends Thread{ 
    
    public String recibido;
    
    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(9999);
            Paquete datosRecibir;
            
            while(true){
                Socket socket = servidor.accept();
                String nombre, ipDestinatario, mensaje;
                
                ObjectInputStream paqueteDatos = new ObjectInputStream(socket.getInputStream());
                datosRecibir = (Paquete) paqueteDatos.readObject();
                
                nombre = datosRecibir.getNombre();
                ipDestinatario = datosRecibir.getIpDestinatario();
                mensaje = datosRecibir.getMensaje();
                
                recibido = "Mensaje de: " + nombre + "\n" + mensaje + "Para: " + ipDestinatario;
                //System.out.println(recibido);
                socket.close();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
