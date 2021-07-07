package conexion;

import java.io.Serializable;

public class Paquete implements Serializable{
    
    String nombre, ipDestinatario, mensaje;
    
    //Metodos Setter y Getter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos Setter y Getter para ipDestinatario
    public String getIpDestinatario() {
        return ipDestinatario;
    }

    public void setIpDestinatario(String ipDestinatario) {
        this.ipDestinatario = ipDestinatario;
    }

    //Metodos Setter y Getter para Mensaje
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
