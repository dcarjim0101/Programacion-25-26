import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("introduce un numero para saber su valor absoluto:");
        numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);
        System.out.println("el valor absoluto de " + numero + " es: " + valorAbsoluto);

        int valorAbsoluto_operador= (numero >= 0) ? numero : -numero;
        System.out.println("el valor absoluto de " + numero + " es: " + valorAbsoluto_operador);
    }
}
