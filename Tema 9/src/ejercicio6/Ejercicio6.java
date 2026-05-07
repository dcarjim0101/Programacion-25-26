package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos años crees que vivirás?: ");
		int años = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Cuál es tu nombre?: ");
		String nombre = sc.nextLine();
		
		años = años + 10;
		
		System.out.println("Hola " + nombre + ", " + "los astros dicen que morirás a los " + años + " " + "años por culpa de un café frío");
	}
}
