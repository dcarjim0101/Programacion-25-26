package ejercicio9;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {
	public static void main(String[] args) {

        File archivo = new File("notas.txt");

        try {

            if (archivo.exists()) {
                System.out.println("el archivo existe");
            } else {
                archivo.createNewFile();
                System.out.println("archivo creado");
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
