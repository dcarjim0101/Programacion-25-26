package prog.ud4.ejercicios3;

public class Vehiculo {
	
	// atributos
	String matricula;
	String marca;
	int aniofabricacion;
	double precio;
	TipoVehiculo tipo;
	
	// constructor
	Vehiculo(String matricula, String marca, int aniofabricacion, double precio, TipoVehiculo tipo) {
		this.matricula = matricula;
		this.marca = marca;
		this.aniofabricacion = aniofabricacion;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	void mostrarInformacion() {
		System.out.println("datos");
	}
	
	boolean esAntiguo() {
		if (aniofabricacion < 2016) {
			return true;
		}else{
			return false;
		
		}
	}
	
	void aplicarDescuento(double porcentaje) {
		
	}
}
