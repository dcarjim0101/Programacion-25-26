
public class Ejercicio33 {
	public static int mayorMenor(int a, int b) {
	    return (a > b) ? a : b;
	}
	
	public static int mayorMenor(int a, int b, int c) {
	    if (a > b && a > c) {
	    	System.out.println("el numero " + a + "es el mayor");
	    } else if (b > a && b > c) {
	    	System.out.println("el numero " + b + "es el mayor");
	    } else if (c > a && c > b) {
	    	System.out.println("el numero " + c + "es el mayor");
	    }
	    return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		System.out.println("El numero mayor es: " + mayorMenor(16, 28, 32));
	}
}
