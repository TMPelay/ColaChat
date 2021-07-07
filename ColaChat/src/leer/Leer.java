package leer;

import java.io.File;
import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Leer {
    int n = 0;
    
    public static void findAllFilesInFolder(File folder) {
	for (File file : folder.listFiles()) {
		if (!file.isDirectory()) {
			System.out.println(file.getName());
                        System.out.println(folder.listFiles());
		} else {
			findAllFilesInFolder(file);
		}
	}
    }
    
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        Scanner in = new Scanner(System.in);
        //String[] rutas = new String[n];
        
        System.out.print("Elija una ruta: ");
        String ruta = "/home/tomas/Programacion/Servidor/ColaChat/Master/" + in.nextLine();
        
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                File folder = new File(ruta);
		findAllFilesInFolder(folder);
            }
        };
        
        if(ruta.equals("")){}else{timer.schedule(tarea, 0, 10000);}
    }
}
