package prog.ud7.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		 
		 
		// 1. introducir numeros enteros
		 
		 List<Integer> numeros = new ArrayList<>();
		 // introducirNumeros(numeros);
		 
		 // 2. lanzar una excepcion cuando al metodo se le pase un numero que ya esta en la lista
		 try {
	            introducirNumeros(numeros);
	        } catch (IllegalArgumentException e) {
	        	// 4. capturar la excepcion dentro del main
	        	// mensaje de la excepcion
	            System.out.println(e.getMessage());
	            
	            // traza del error
	            e.printStackTrace();
	        }
		 
		 System.out.println("Lista final: " + numeros);
		 
	}
	
	// 1. metodo que introduce numeros en una lista
			public static void introducirNumeros(List<Integer> lista) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("cuantos numeros quieres introducir?: ");
		        int cantidad = sc.nextInt();
		        
		        for (int i = 0; i < cantidad; i++) {
		        	
		            System.out.print("introduce numero " + (i + 1) + ": ");
		            int num = sc.nextInt();
		            
		            // 3. si el numero ya existe, se lanza la excepcion
		            if (lista.contains(num)) {
		                throw new IllegalArgumentException("error: el numero " + num + " ya esta en la lista");
		            }
		            
		            lista.add(num);
		        }
		        
		        System.out.println("numeros introducidos correctamente");
		}
			
			
}
