package prog.ud8.ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio2 {
	public static void main(String[] args) {
		// 1. Copia el código del ejercicio anterior en una nueva clase para reutilizar la lista que creaste.
		
		// Crear una lista sin ninguna referencia (nula)
        ArrayList<Persona> lista = new ArrayList<>();
        System.out.println(lista);

        // Asignarle una nueva lista vacía que sea una instancia de la clase ArrayList
        ArrayList<Persona> listaNueva = new ArrayList<>();
        System.out.println(listaNueva);

        // Añadir 3 personas (tipo Persona) en la lista
        lista.add(new Persona("Juan"));
        lista.add(new Persona("Ana"));
        lista.add(new Persona("Pedro"));
        System.out.println(lista);

        // Obtener la última persona de la lista e imprimirla por consola
        Persona ultimaPersona = lista.get(lista.size() - 1);
        System.out.println("ultima persona: " + ultimaPersona);
        System.out.println(lista);

        // Modfica el nombre de la primera persona de la lista
        lista.get(0).nombre = "NombreModificado";
        System.out.println(lista);

        // Elimina de la lista la persona que ocupa la posición central
        int posicionCentral = lista.size() / 2;
        lista.remove(posicionCentral);
        System.out.println(lista);

        // Recorre la lista con un for clásico (usándo índice) imprimiendo el nombre de cada persona
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nombre);
        }
        
        // Crea una nueva persona, añádela a la lista y pregunta si la lista contiene a esa persona recien creada para confirmarlo
        Persona nuevaPersona = new Persona("Laura");
        lista.add(nuevaPersona);
        boolean contiene = lista.contains(nuevaPersona);
        System.out.println("la lista contiene a laura? " + contiene);
        
        // Vacía la lista y pregunta si está vacía para confirmarlo
        lista.clear();
        boolean estaVacia = lista.isEmpty();
        System.out.println("la lista esta vacia? " + estaVacia);
        
        // 2. Copia las personas de la lista original a una nueva lista que sea una instancia de la clase LinkedList.
        LinkedList<Persona> listaLinked = new LinkedList<>(lista);
        System.out.println("ArrayList: " + lista);
        System.out.println("LinkedList: " + listaLinked);
        
        // 3. En la nueva lista, intercambia las personas de las posiciones primera y última.
        Persona primera = listaLinked.get(0);
        Persona ultima = listaLinked.get(listaLinked.size() - 1);
        
        listaLinked.set(0, ultima);
        listaLinked.set(listaLinked.size() - 1, primera);
        System.out.println("LinkedList intercambiada: " + listaLinked);
	}
}