package prog.ud5.refuerzo;

class CuentaBancaria {
	// atributos privados
	private String titular;
	private double saldo;
	private static int totalCuentas;
	
	// constructores
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		totalCuentas =+ 1;
	}
	
	// metodos
	void mostrarDatos() {
		
	}
	
	void ingresar(double cantidad) {
		
	}
	
	static int getTotalCuentas() {
		return totalCuentas;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
