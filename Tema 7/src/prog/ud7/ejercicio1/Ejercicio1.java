package prog.ud7.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. Reproduce el programa en tu ordenador y explica qué es lo que ocurre
		// System.out.println("COMIENZO PROGRAMA DIVISIÓN");
		// int dividendo = 5;
		// int divisor = 0;
		// System.out.println("Resultado: " + dividendo / divisor);
		// System.out.println("FIN PROGRAMA DIVISIÓN");
		// lanza una excepcion porque java no puede dividir entre 0
		
		// 2. Introduce un bloque try - catch - finally.
		System.out.println("COMIENZO PROGRAMA DIVISIÓN");
		
		// int dividendo = 5;
		// int divisor = 0;
		
		// 6. Pedir dividendo y divisor al usuario, ¿dónde se cerraría el flujo?
				System.out.print("introduce dividendo: ");
		        int dividendo = sc.nextInt();
		        
		        System.out.print("introduce divisor: ");
		        int divisor = sc.nextInt();
		
		try {
		    System.out.println("resultado: " + dividendo / divisor);
		} catch (ArithmeticException e) {
		    System.out.println("imposible dividir por 0");
		    System.out.println("mensaje de la excepción: " + e.getMessage());
		} finally {
		    System.out.println("FIN PROGRAMA DIVISIÓN");
		}
		
		// aqui se cierra el flujo del punto 6
		
		// 3. Depura el programa e indica cuál sería el flujo del mismo cuando ocurre una excepción y cuando no ocurre ninguna excepción (para esto último puedes cambiar el valor de divisor)
		// lo que ocurre, es que al intentar hacer la division aparece una excepcion, se va al catch y aparece el mensaje de no se puede dividir por 0 y se ejecuta el finally.
		// tambien puede ocurrir que no aparezca la excepcion y lo que hace es imprimir el resultado correcto, ignora el catch y se ejecuta el finally.
		
		// 4. Mostrar el mensaje de ex
		// lo que hace que se muestre ese mensaje es e.getMessage.
		
		// 5. Mostrar la traza del error
		// e.printStackTrace();
		
		// 7. ¿Qué pasa si el usuario introduce letras en vez de números?
		// lo que pasa es que java no puede convertirlas a enteros y salta la excepcion.
		
		// 8. ¿La excepción resultante deberíamos prevenirla o gestionarla?
		// se puede prevenir escribiendo un mensaje tipo ("Error: debes introducir un número") en el catch.
		
		// 9. Describe el comportamiento y la salida que se obtendría si se añadiera un bloque catch justo a continuación del bloque try para capturar excepciones del tipo java.lang.Exception y se repitieran las mismas entradas.
		// si el usuario introduce letras, se ejecuta nextInt(), salta la excepcion y no haria falta un catch especifico y se ejecuta el finally.
		
		// 10. ¿Es posible capturar excepciones de tipo Throwable? Justifica tu respuesta.
		// es posible capturarlas de ese tipo porque es la clase padre de todas las excepciones y errores en java.
		
	}
}
