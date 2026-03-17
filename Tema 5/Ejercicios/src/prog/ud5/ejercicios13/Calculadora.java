package prog.ud5.ejercicios13;
import java.util.Scanner;

public class Calculadora {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static double resultado;
	
	private static final double PI = 3.14;
	
	public static void menu() {
		System.out.println("introduzca un numero: ");
		System.out.println("1 para sumar");
		System.out.println("2 para restar");
		int opcion = sc.nextInt();
		swicth (opcion){
			case 1 -> resultado = sumar();
			default -> 
			throw new Illegal
		}
	}
	
	public static double sumar() {
		System.out.println("introduzca dos numeros:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		// invocar a operaciones
		return Operaciones.sumar(a, b);
		
	}
	
	
}
