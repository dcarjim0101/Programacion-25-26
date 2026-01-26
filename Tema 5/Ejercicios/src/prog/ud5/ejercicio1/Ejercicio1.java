package prog.ud5.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1 = new CuentaBancaria("david", 2000);
		cuenta1.setTitular("david carrero");
		cuenta1.setSaldo(1000);
		cuenta1.retirar(50);
		System.out.println("Saldo total: " + cuenta1.getSaldo());
	}

}
