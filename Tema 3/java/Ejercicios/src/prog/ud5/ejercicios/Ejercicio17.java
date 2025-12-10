import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("introduce el primer numero entero:");
        n1 = scanner.nextInt();
        System.out.println("introduce el segundo numero entero:");
        n2 = scanner.nextInt();

        // comparacion de los numeros
        if (n1 == n2) {
            System.out.println("los numeros son iguales");
        }  else if (n1 != n2) {
                if (n1 > n2) {
                    System.out.println("el numero " + n1 + " es mayor que " + n2);
                } else {
                    System.out.println("el numero " + n2 + " es mayor que " + n1);
                }
        }
    }
}