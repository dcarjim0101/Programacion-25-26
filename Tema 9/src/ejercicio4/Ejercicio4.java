package ejercicio4;

import java.io.IOException;

public class Ejercicio4 {
	public static void main(String[] args) throws IOException {
		byte b[] = new byte[5];
		try {
			System.in.read(b);
		}catch (IOException ioe) {
			System.out.println(ioe);
		}
		String s = new String(b);
		System.out.println(s);
	}
	
}

// este código lo que hace es imprimir los primeros 5 caracteres que se introduzcan por teclado
