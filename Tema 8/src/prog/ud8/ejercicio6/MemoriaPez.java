package prog.ud8.ejercicio6;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class MemoriaPez {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 3. reto 3
        LinkedHashSet<String> colores = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("\nIntroduce un color: ");
            String color = sc.nextLine();

            // 12. Guardar color respetando el orden de entrada
            colores.add(color);
        }
        System.out.println("\nColores en orden de entrada:");
        for (String c : colores) {
            System.out.println(c);
        }
	}
}
