package prog.ud7.ejercicio5;

//1. crear clase NumeroRepetido que herede de IllegalArgumentException
public class NumeroRepetido extends IllegalArgumentException {

	// 2. constructor con parametros que reutilice el codigo del padre
    public NumeroRepetido(String mensaje) {
        super(mensaje);
    }
}