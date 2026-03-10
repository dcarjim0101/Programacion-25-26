package prog.ud5.ejercicios7;

public class Coche extends Vehiculo{
	private int numPuertas;
	
	Coche(String marca, String modelo, int anio, int numPuertas){
		super(marca, modelo, anio);
		this.numPuertas = numPuertas;
	}
	
	public void mostraDetalles() {
		super.mostrarDetalles();
		System.out.println();
	}
	
	public void mover() {
		
	}
}
