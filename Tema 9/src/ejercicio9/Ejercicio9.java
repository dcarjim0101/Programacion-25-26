package ejercicio9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9 {
	public static void main(String[] args) throws IOException{

        File archivo = new File("notas.txt");

        if (archivo.exists()) {
            System.out.println(archivo.getName());
            System.out.println(archivo.getAbsolutePath());
        } else {
            System.out.println("archivo creado");
            try {
                if (archivo.createNewFile()) {
                	fw = new FileWriter(archivo);
                	System.out.println(archivo.getName());
                    System.out.println(archivo.getAbsolutePath());
                    fw.write("hola");
                }
            } catch (IOException e) {
            	System.err.println(e.getMessage());
            } finally {
            	fw.close();
            }
        }
    }
}
