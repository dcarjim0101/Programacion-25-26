package prog.ud7.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		// lanzar excepcion manualmente si la edad es menor que 0
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce tu edad: ");
        int edad = sc.nextInt();
        
        try {
            if (edad < 0) {
                throw new IllegalArgumentException("la edad no puede ser negativa");
            }

            System.out.println("edad valida: " + edad);

        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }
	}
}
