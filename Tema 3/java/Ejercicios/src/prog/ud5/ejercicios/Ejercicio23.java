import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = (int)(Math.random() * 1);
        int b = (int)(Math.random() * 20);

        int numero;

        // bucle para que no se acabe hasta adivinar el numero
        do {
            System.out.println("Adivina el numero entre " + a + " y " + b + ": ");
            numero = scanner.nextInt();
            if (numero != b) {
                System.out.println("numero incorrecto");
            } else {
                System.out.println("numero correcto");
            }
        } while (numero != b);
        
    }
}
