import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (int)(Math.random() * 1);
        int b = (int)(Math.random() * 100);
        int respuesta;
        int aciertos;

        int suma;
        suma = a + b;

        System.out.println("cuanto es " + a + " + " + b + "?: ");
        respuesta = scanner.nextInt();
        aciertos = 0;

        // bucle para intentar adivinar la suma
        do { 
            if (respuesta == suma) {
                System.out.println("correcto, " + a + " + " + b + " = " + suma);
                aciertos++;
                break;
            } else {
                System.out.println("cuanto es " + a + " + " + b + "?");
                respuesta = scanner.nextInt();
                System.out.println("incorrecto, intenta de nuevo");
            }
        } while (true);
        System.out.println("numero de intentos: " + aciertos);
    }
}