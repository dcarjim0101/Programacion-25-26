package prog.ud5.ejercicios7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo("Seat", "600", 2013);
		v mostrarDetalles;
		
		Coche c = new Coche("peugeot", "2323", 2018, 5);
		c.mostrarDetalles();
		
		Moto m = new Moto();
		m.mover();
	}

}
