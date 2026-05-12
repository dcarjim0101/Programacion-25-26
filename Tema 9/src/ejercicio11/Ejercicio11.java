package ejercicio11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio11 {
	public static void main(String[] args) throws IOException {
		try {
			File file  = new File ("record.txt");
			RandomAccessFile record = new RandomAccessFile(file, "rw");
				record.writeBytes("Nivel:001");
				record.seek(6);
				record.writeBytes("005");
				record.writeBytes("666");
			}
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}