package prog.ud5.ejercicios15;

public class ComparacionParametros {
	public static void main(String[] args) {
		
	}
	
	public static void modificarPrimitivo(int numero) {
		numero = numero * 2;
		System.out.println("dentroo del metodo, numero = " + numero);
	}
	
	public static void modificarObjeto(StringBuilder texto) {
		texto.append("modificado");
		System.out.println("dentro del metodo, texto = " + texto);
	}
}
