import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero :");
        int numero;
        numero = scanner.nextInt();

        while (numero > 0 || numero < 0) {
            if (numero % 2 == 0) {
                System.out.println("el numero " + numero + " es par");
            } else {
                System.out.println("el numero " + numero + " es impar");
            }

            if (numero > 0) {
                System.out.println("el numero " + numero + " es positivo");
            } else {
                System.out.println("el numero " + numero + " es negativo");
            }

            System.out.println("el cuadrado de " + numero + " es: " + numero * numero);

            System.out.println("");
            
            System.out.println("introduce otro numero (0 para salir):");
            numero = scanner.nextInt();
            System.out.println("salidnedo...");
        }
    }
}
