package prog.ud4.ejercicios;
import prog.ud4.ejercicios.Persona.Sexo;

public class Ciudad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiaDeLaSemana miercoles = DiaDeLaSemana.MIERCOLES;
		
		Persona juan = new Persona("Juan", "Pérez", 20, 1.8f, Sexo.MASCULINO);
		System.out.println(juan.nombre);
		System.out.println(juan.apellido);
		System.out.println(juan.edad);
		System.out.println(juan.estatura);
		System.out.println(juan.sexo);
		
		Persona francisco;
		francisco = new Persona();
		francisco.nombre = "Francisco";
		francisco.edad = 54;
		francisco.estatura = 1.87f;
		
		Persona laura;
		laura = new Persona();
		laura.nombre = "Laura";
		laura.edad = 48;
		laura.estatura = 1.61f;
		
		Persona miguel;
		miguel = new Persona();
		miguel.nombre = "Miguel";
		miguel.edad = 32;
		miguel.estatura = 1.79f;
		
		System.out.println(francisco);
		System.out.println("hola soy " + francisco.nombre + " y tengo " + francisco.edad + " años ");
		
		System.out.println(laura);
		System.out.println("hola soy " + laura.nombre + " y tengo " + laura.edad + " años ");
		
		System.out.println(miguel);
		System.out.println("hola soy " + miguel.nombre + " y tengo " + miguel.edad + " años ");
		
	}

}