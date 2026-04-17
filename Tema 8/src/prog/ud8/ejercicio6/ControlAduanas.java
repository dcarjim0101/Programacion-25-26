<<<<<<< HEAD
package prog.ud8.ejercicio6;

import java.util.HashSet;
import java.util.Scanner;

public class ControlAduanas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. reto 1
		HashSet<String> paises = new HashSet<>();
		
		for (int i = 0; i < 5; i++) {
            System.out.print("introduce un pais: ");
            String pais = sc.nextLine();
            
            if (paises.contains(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            }
            
            paises.add(pais);
            
        System.out.println("\nPaíses únicos: " + paises.size());
	}
		
	}
}
=======
package prog.ud8.ejercicio6;

import java.util.HashSet;
import java.util.Scanner;

public class ControlAduanas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. reto 1
		HashSet<String> paises = new HashSet<>();
		
		for (int i = 0; i < 5; i++) {
            System.out.print("introduce un pais: ");
            String pais = sc.nextLine();
            
            if (paises.contains(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            }
            
            paises.add(pais);
            
        System.out.println("\nPaíses únicos: " + paises.size());
	}
		
	}
}
>>>>>>> 2c53104314bc734b9ee76ccd19fbef58a5f278c0
