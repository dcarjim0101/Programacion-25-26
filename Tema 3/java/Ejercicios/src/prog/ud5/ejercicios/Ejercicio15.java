import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un numero decimal:");
        double numeroDecimal = scanner.nextDouble();

        long numeroRedondeado = Math.round(numeroDecimal);
        System.out.println("el numero " + numeroDecimal + " redondeado al entero mas proximo es: " + numeroRedondeado);
    }
}
