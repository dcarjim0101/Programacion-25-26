package prog.ud6.ejercicio2;

public class Pajaro extends AnimalBase implements Animal,Volador{

	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.print("pio");
		
	}

	@Override
	public void comer() {
		System.out.print("come pipas");
		
	}
	
	@Override
	public void volar() {
		System.out.print("vuela con las alas");
		
	}
}
