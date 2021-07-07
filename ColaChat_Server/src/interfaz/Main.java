package interfaz;

import conexion.Servidor;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main extends JFrame{
    
    private JTextArea area;
    Servidor mensajero = new Servidor();

    public Main(){
        setLayout(null);
        setTitle("ColaChat - Server");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        area = new JTextArea();
        area.setBounds(5, 5, 300, 600);
        area.setEditable(false);
        add(area);
        
        Servidor escuchar = new Servidor();
        escuchar.start();
    }
    
    public static void main(String[] args) {
        Main ventana = new Main();
        ventana.setBounds(0, 0, 310, 610);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}

