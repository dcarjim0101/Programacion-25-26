package prog.ud5.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("p1");
		Gato g1 = new Gato("g1");
		Perro p2 = new Perro("p2");
		Vaca v1 = new Vaca("v1");
		Vaca v2 = new Vaca("v2");
		Pajaro pa1 = new Pajaro("pa1");
		
		Animal[] animales = new Animal[6];
		animales[0] = p1;
		animales[1] = g1;
		animales[2] = p2;
		animales[3] = v1;
		animales[4] = v2;
		animales[5] = pa1;
		
		for (Animal animal : animales) {
			AnimalBase a = (AnimalBase)animal;
			a.mostrarNombre();
			animal.hacerSonido();
			animal.comer();
			System.out.println(" ");
			
			if (a instanceof Volador) {
				((Volador)a).volar();
			}
		}
	}

}
