<<<<<<< HEAD
package prog.ud8.ejercicio6;

import java.util.Scanner;
import java.util.TreeSet;

public class RankingVideojuegos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 2. reto 2
        TreeSet<String> juegos = new TreeSet<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("\nIntroduce un juego: ");
            String juego = sc.nextLine();

            // 8. Guardar juego
            juegos.add(juego);
        }
        
        System.out.println("\nJuegos ordenados:");
        for (String j : juegos) {
            System.out.println(j);
        }
	}
}
=======
package prog.ud8.ejercicio6;

import java.util.Scanner;
import java.util.TreeSet;

public class RankingVideojuegos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 2. reto 2
        TreeSet<String> juegos = new TreeSet<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("\nIntroduce un juego: ");
            String juego = sc.nextLine();

            // 8. Guardar juego
            juegos.add(juego);
        }
        
        System.out.println("\nJuegos ordenados:");
        for (String j : juegos) {
            System.out.println(j);
        }
	}
}
>>>>>>> 2c53104314bc734b9ee76ccd19fbef58a5f278c0
