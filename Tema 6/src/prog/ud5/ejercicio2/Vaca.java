package prog.ud5.ejercicio2;

public class Vaca extends AnimalBase implements Animal{
	
	public Vaca(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("muuu");
	}

	public void comer() {
		System.out.println("come hierba");
	}
	
}
