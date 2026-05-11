package ejemplos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {

	public static void main(String[] args) {
		
		File mifichero = new File("pruebafilewriter.txt");
		try {
			FileWriter fw = new FileWriter(mifichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
