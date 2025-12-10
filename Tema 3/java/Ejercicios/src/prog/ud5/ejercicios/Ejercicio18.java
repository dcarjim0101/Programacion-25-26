import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n;
        System.out.println("introduce un numero decimal casi-cero: ");
        n = scanner.nextFloat();

        // if con la condicion de que el numero no sea mas grannde que 0.1 ni mas pequeño que -0.1
        if (n < 0.1 && n > -0.1) {
            System.out.println("el numero " + n + " es casi-cero");
        } else {
            System.out.println("el numero " + n + " no es casi-cero");
        }
    }
}
