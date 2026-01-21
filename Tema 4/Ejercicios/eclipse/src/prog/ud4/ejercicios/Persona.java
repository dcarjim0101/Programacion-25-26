package prog.ud4.ejercicios;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	float estatura;
	DiaDeLaSemana dia;
	Sexo sexo;
	
	Persona() {
		nombre = "Francisco";
		edad = 54;
	}
	
	Persona(String nombre, String apellido, int edad, float estatura, Sexo sexo){
		this.sexo = sexo;
	}
	
	Persona(String nombre, String apellido, int edad, float estatura, DiaDeLaSemana dia, Sexo sexo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.sexo = sexo;
	}
	
	void saludar() {
		System.out.println("Hola");
	}
	
	void cumplirAños() {
		edad += 1;
	}
	
	void crecer(float incremento) {
		estatura = estatura + incremento;
	}
	
	public enum Sexo {
		MASCULINO, FEMENINO, NO_BINARIO
	}
}
