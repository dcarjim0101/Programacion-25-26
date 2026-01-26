package prog.ud5.refuerzo;

public class Ejercicio1 {

	public static void main(String[] args) {
		CuentaBancaria uno = new CuentaBancaria("juan", 2000);
		uno.setTitular("juan montes");
		uno.setSaldo(1500);
		System.out.println(uno.mostrarDatos());
		CuentaBancaria dos = new CuentaBancaria("manolo", 1200);
		dos.setTitular("manolo montes");
		dos.setSaldo(1000);
		System.out.println(dos.mostrarDatos());
		CuentaBancaria tres = new CuentaBancaria("pepe", 700);
		tres.setTitular("pepe montes");
		tres.setSaldo(500);
		System.out.println(tres.mostrarDatos());
	}
}
