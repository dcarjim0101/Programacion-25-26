package prog.ud5.ejercicio2;

public class Gato extends AnimalBase implements Animal{
	
	public Gato(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("miau");
	}
	
	public void comer() {
		System.out.println("come pescado");
	}
}
