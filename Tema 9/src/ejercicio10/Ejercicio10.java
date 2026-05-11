package ejercicio10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		
		String nombreFichero = "Ejercicio10.txt";
		
		File file = new File(nombreFichero);
		
		if (file.exists()) {
			FileWriter fw = new FileWriter(nombreFichero, true);
			fw.write("Fran");
			fw.close();
			FileReader fr = new FileReader(file);

			int unByte;
			while ((unByte = fr.read()) != -1) {
				System.out.println((char)unByte + " ");
			}
			fr.close();
		
		} else {
			System.out.println("no existe fichero");
		}
		
		FileReader fr = new FileReader(nombreFichero);
	}

}
