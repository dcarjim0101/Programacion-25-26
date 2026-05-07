package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca varios caracteres: ");
		
		while (true) {
			String caracteres = sc.nextLine();
            if (caracteres.length() == 0) {
                break;
            }
            System.out.println("has introducido: " + caracteres);
        }
		
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.next();
		System.out.println("Hola " + nombre);
	}
	
}
	
