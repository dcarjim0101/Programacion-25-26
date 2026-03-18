package prog.ud6.ejercicio1;

public class Perro extends Animal implements Corredor{
	
	@Override
	public void hacerSonido() {
		System.out.println("guau");
	}
	
	public void moverse() {
		System.out.println("anda a cuatro patas");
	}
	
	public void mostrarInfo() {
		System.out.println("tiene cola");
	}
	
	public void correr() {
		System.out.println("corre");
	}
}
