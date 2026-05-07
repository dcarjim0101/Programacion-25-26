package ejercicio2;

import java.io.FileWriter;

public class Ejercicio2 {
	
    public static void main(String[] args) throws Exception {
        // Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(1000); // Espera 10 segundos
        
        // No hemos puesto ni flush() ni close()
        
        System.out.close();
    }
}

// No se ha escrito nada porque no encuentra el archivo
// Lo arreglaria creando un archivo en la carpeta donde está la actividad