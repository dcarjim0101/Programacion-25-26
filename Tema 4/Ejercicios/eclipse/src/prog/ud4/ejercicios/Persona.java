package prog.ud4.ejercicios;

public class Persona {
	String nombre;
	int edad;
	double estatura;
	
	Persona() {
		nombre = "Francisco";
		edad = 54;
	}
	
	Persona(String nombre){
		this.nombre = nombre;
	}
	
	void saludar() {
		System.out.println("Hola");
	}
	
	void cumplirAños() {
		edad += 1;
	}
	
	void crecer(double incremento) {
		estatura = estatura + incremento;
	}
}
