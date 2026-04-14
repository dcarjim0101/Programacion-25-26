package prog.ud8.ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
	public static void main(String[] args) {
		// 1. Crear una lista sin ninguna referencia (nula)
        ArrayList<Persona> lista = new ArrayList<>();
        System.out.println(lista);

        // 2. Asignarle una nueva lista vacía que sea una instancia de la clase ArrayList
        ArrayList<Persona> listaNueva = new ArrayList<>();
        System.out.println(listaNueva);

        // 3. Añadir 3 personas (tipo Persona) en la lista
        lista.add(new Persona("Juan"));
        lista.add(new Persona("Ana"));
        lista.add(new Persona("Pedro"));
        System.out.println(lista);

        // 4. Obtener la última persona de la lista e imprimirla por consola
        Persona ultimaPersona = lista.get(lista.size() - 1);
        System.out.println("ultima persona: " + ultimaPersona);
        System.out.println(lista);

        // 5. Modfica el nombre de la primera persona de la lista
        lista.get(0).nombre = "NombreModificado";
        System.out.println(lista);

        // 6. Elimina de la lista la persona que ocupa la posición central
        int posicionCentral = lista.size() / 2;
        lista.remove(posicionCentral);
        System.out.println(lista);

        // 8. Recorre la lista con un for clásico (usándo índice) imprimiendo el nombre de cada persona
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nombre);
        }
        
        // 9. Crea una nueva persona, añádela a la lista y pregunta si la lista contiene a esa persona recien creada para confirmarlo
        Persona nuevaPersona = new Persona("Laura");
        lista.add(nuevaPersona);
        boolean contiene = lista.contains(nuevaPersona);
        System.out.println("la lista contiene a laura? " + contiene);
        
        // 10. Vacía la lista y pregunta si está vacía para confirmarlo
        lista.clear();
        boolean estaVacia = lista.isEmpty();
        System.out.println("la lista esta vacia? " + estaVacia);
	}
}
