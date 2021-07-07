package interfaz;

import conexion.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    
    private JTextField fldMensaje, fldIp, fldNombre;
    private JButton btnEnviar;
    private JTextArea area;
    
    public Main(){
        setLayout(null);
        setTitle("ColaChat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        fldMensaje = new JTextField();
        fldMensaje.setBounds(15,10,220,20);
        add(fldMensaje);
        
        fldNombre = new JTextField();
        fldNombre.setBounds(130,40,105,20);
        add(fldNombre);
        
        fldIp = new JTextField();
        fldIp.setBounds(15,40,105,20);
        add(fldIp);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(15,70,220,30);
        add(btnEnviar);
        btnEnviar.addActionListener(this);
        
        area = new JTextArea();
        area.setBounds(15,110,220,360);
        add(area);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnEnviar){
            if(fldMensaje.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar un texto");
            }
            else{
                Cliente mensajero = new Cliente();
                mensajero.Cliente(fldIp.getText(), fldNombre.getText(), fldMensaje.getText());
            }
        }
    }
    
    public static void main(String[] args) {        
        Main ventana = new Main();
        ventana.setBounds(0,0,250,510);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}
