package examenUd8;

public class Comparar {
	// Ejercicio 4
	public int compare(precio1, precio2, precio3) {
		if (precio1.getPrecio() > precio2.getPrecio() && precio1.getPrecio() > precio3.getPrecio()) {
			System.out.println("el primer producto es el mas barato")
		} else if (precio2.getPrecio() > precio1.getPrecio() && precio2.getPrecio() > precio3.getPrecio()) {
			System.out.println("el segundo producto es el mas barato")
		} else if (precio3.getPrecio() > precio1.getPrecio() && precio3.getPrecio() > precio2.getPrecio()) {
			System.out.println("el tercer producto es el mas barato")
		}
}
