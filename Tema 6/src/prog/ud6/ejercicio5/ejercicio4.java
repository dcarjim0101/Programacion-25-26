package prog.ud6.ejercicio5;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		try {
			introduceEnteros();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fin");
		}
		System.out.println("Finalisimo");
	}
	
	private static void introduceEnteros() {
		int[] lista = new int[5];
		lista[0] = 0;
		lista[1] = 1;
		lista[2] = 2;
		lista[3] = 3;
		lista[4] = 4;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// invocar metodo y si devuelve true lanzar la excepcion
		if (estaEnLista(lista, num)) {
			throw new NumeroRepetido("numero repetido");
		}
		
		for (int e: lista) {
			System.out.println(e);
		}
	}
	
	// crear metodo que diga si un numero esta en una lista
	private static boolean estaEnLista(int[] lista, int num) {
		boolean esta = false;
		for (int e: lista) {
			if (e == num)
				esta = true;
		}
		
		return esta;
	}
}
