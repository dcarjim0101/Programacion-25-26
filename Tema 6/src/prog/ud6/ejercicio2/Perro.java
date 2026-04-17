package prog.ud6.ejercicio2;

public class Perro extends AnimalBase implements Animal{

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("guau");
	}
	
	public void comer() {
		System.out.println("come comida");
	}

}
