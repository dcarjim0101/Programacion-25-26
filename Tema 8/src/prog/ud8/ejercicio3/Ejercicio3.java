<<<<<<< HEAD
package prog.ud8.ejercicio3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Crear una lista de nombres
		List<String> nombres = new ArrayList<String>();
		
		// añadir nombres
		nombres.add("juan");
        nombres.add("maria");
        nombres.add("pedro");
        nombres.add("lucia");
        nombres.add("carlos");
        
        // 2. Mostrar los nombres
        mostrarNombres(nombres);
        
        // 3. Añadir un nuevo nombre por teclado
        System.out.print("introduce un nuevo nombre: ");
        String nuevoNombre = sc.nextLine();
        
        nombres.add(nuevoNombre);
        
        System.out.println("lista actualizada:");
        mostrarNombres(nombres);
        
        // 4. Eliminar un nombre específico
        System.out.print("introduce el nombre que quieres eliminar: ");
        String nombreEliminar = sc.nextLine();
        
        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("nombre eliminado");
        } else {
            System.out.println("el nombre no esta en la lista");
        }
        
        System.out.println("lista final:");
        mostrarNombres(nombres);
        
        // 5. Mostrar el número total de nombres con size
        System.out.println("numero total de nombres: " + nombres.size());
	}
	
	// recorrer la lista con for-each
	public static void mostrarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
  
=======
package prog.ud8.ejercicio3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Crear una lista de nombres
		List<String> nombres = new ArrayList<String>();
		
		// añadir nombres
		nombres.add("juan");
        nombres.add("maria");
        nombres.add("pedro");
        nombres.add("lucia");
        nombres.add("carlos");
        
        // 2. Mostrar los nombres
        mostrarNombres(nombres);
        
        // 3. Añadir un nuevo nombre por teclado
        System.out.print("introduce un nuevo nombre: ");
        String nuevoNombre = sc.nextLine();
        
        nombres.add(nuevoNombre);
        
        System.out.println("lista actualizada:");
        mostrarNombres(nombres);
        
        // 4. Eliminar un nombre específico
        System.out.print("introduce el nombre que quieres eliminar: ");
        String nombreEliminar = sc.nextLine();
        
        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("nombre eliminado");
        } else {
            System.out.println("el nombre no esta en la lista");
        }
        
        System.out.println("lista final:");
        mostrarNombres(nombres);
        
        // 5. Mostrar el número total de nombres con size
        System.out.println("numero total de nombres: " + nombres.size());
	}
	
	// recorrer la lista con for-each
	public static void mostrarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
  
>>>>>>> 2c53104314bc734b9ee76ccd19fbef58a5f278c0
}