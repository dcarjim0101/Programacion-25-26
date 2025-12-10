import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int factorial;
        factorial = 1;
        System.out.println("introduce un numero positivo: ");
        n = scanner.nextInt();

        // bucle para calcular el factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("el factorial de " + n + " es: " + factorial);
    }
}
