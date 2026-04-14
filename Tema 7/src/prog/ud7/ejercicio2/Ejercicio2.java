package prog.ud7.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		// 1. invocar el metodo que realiza la division
		Scanner sc = new Scanner(System.in);

        System.out.println("calculadora");

        System.out.print("introduce el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("introduce el divisor: ");
        int divisor = sc.nextInt();

        //  3. Captúralas en el método que invoca al método de división (por ejemplo, en el main) 
        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("rrror: no se puede dividir entre 0");
        }

	}
	
	// 2. Añade el código necesario para propagar las excepciones que puedan producirse en el método de división.
	public static double dividir(int a, int b) throws ArithmeticException {
        return (double) a / b;
    }
	
	// 4. Prueba indicar que el método de la división también pueda lanzar la excepción IOException ¿qué ocurre ahora? ¿por qué no ocurría con ArithmeticException?
	// public static double dividir(int a, int b) throws ArithmeticException, IOException {
	    // return (double) a / b;
	// }
	// al añadir ioexception, el compliador obliga a gestionarla o declararla porque es una excepcion comprobada y arithmeticException es no comprobada.
}
