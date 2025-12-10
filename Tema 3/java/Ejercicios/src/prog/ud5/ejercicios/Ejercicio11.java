import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("intrpduce el primer numero:");
        numero1 = scanner.nextInt();

        System.out.println("introduce el segundo numero:");
        numero2 = scanner.nextInt();

        String resultado = (numero1 > numero2) ? "el numero mayor es: " + numero1
                          : (numero1 < numero2) ? "el numero mayor es: " + numero2
                          : "los numeros son iguales.";

        System.out.println(resultado);
    }
}