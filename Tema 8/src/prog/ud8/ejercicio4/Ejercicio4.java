<<<<<<< HEAD
package prog.ud8.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<>();
		
		String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};
		
		Double sumaNotas = 0.0;
		
		for(String nota: notasEntrada) {
			notas.add(Double.valueOf(nota));
			sumaNotas = sumaNotas + Double.valueOf(nota);
		}
		
		Double notaMedia = sumaNotas / notasEntrada.length;
		
		List<Double> aprobados = new ArrayList<>();
		for (Double nota : notas) {
			if (nota >= 5) {
				aprobados.add(nota);
			}
		}
	}
=======
package prog.ud8.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<>();
		
		String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};
		
		Double sumaNotas = 0.0;
		
		for(String nota: notasEntrada) {
			notas.add(Double.valueOf(nota));
			sumaNotas = sumaNotas + Double.valueOf(nota);
		}
		
		Double notaMedia = sumaNotas / notasEntrada.length;
		
		List<Double> aprobados = new ArrayList<>();
		for (Double nota : notas) {
			if (nota >= 5) {
				aprobados.add(nota);
			}
		}
	}
>>>>>>> 2c53104314bc734b9ee76ccd19fbef58a5f278c0
}