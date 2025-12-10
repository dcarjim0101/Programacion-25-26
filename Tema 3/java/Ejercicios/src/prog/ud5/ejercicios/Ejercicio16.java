import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 60);

        int numero;

        while (true) {
            System.out.println("introduce un numero entero entre " + a + " y " + b + ":");
            numero = scanner.nextInt();
            if (numero >= a && numero <= b) {
                break;
            }
    }

        System.out.println("el numero " + numero + " esta comprendido entre " + a + " y " + b);
    }
}