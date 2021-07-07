package conexion;

import java.io.*;
import java.net.Socket;

public class Cliente {
    
    public void Cliente(String ipDestinatario, String nombre, String mensaje){
        try {
            //Abrimos el socket
            Socket socket = new Socket("10.42.0.1", 9999);
            
            //Obtenemos los datos del paquete a enviar
            Paquete datosEnviar = new Paquete();            
            datosEnviar.setIpDestinatario(ipDestinatario);
            datosEnviar.setNombre(nombre);
            datosEnviar.setMensaje(mensaje);
            
            //Enviamos los datos y cerramos el socket
            ObjectOutputStream paqueteDatos = new ObjectOutputStream(socket.getOutputStream());
            paqueteDatos.writeObject(datosEnviar);
            socket.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
