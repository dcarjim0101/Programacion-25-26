import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("introduce el primer numero entero:");
        n1 = scanner.nextInt();
        System.out.println("introduce el segundo numero entero:");
        n2 = scanner.nextInt();
        System.out.println("introduce el tercer numero entero:");
        n3 = scanner.nextInt();

        // ordenacion de mayor a menor
        //mostrar los numeros de mayor a menor
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("el numero mas grande es el " + n1 + "," + " " + "el segundo es el " + n2 + " " + "y el mas pequeño es el " + n3);
            } else if (n3 > n2) {
                System.out.println("el numero mas grande es el " + n1 + "," + " " + "el segundo es el " + n3 + " " + "y el mas pequeño es el " + n2);
            } else {
                System.out.println("error, el segundo y el tercer numero son iguales");
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("el numero mas grande es el " + n2 + "," + " " + "el segundo es el " + n1 + " " + "y el mas pequeño es el " + n3);
            } else if (n3 > n1) {
                System.out.println("el numero mas grande es el " + n2 + "," + " " + "el segundo es el " + n3 + " " + "y el mas pequeño es el " + n1);
            } else {
                System.out.println("error, el primer y el tercer numero son iguales");
            }
        } else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println("el numero mas grande es el " + n3 + "," + " " + "el segundo es el " + n1 + " " + "y el mas pequeño es el " + n2);
            } else if (n2 > n1) {
                System.out.println("el numero mas grande es el " + n3 + "," + " " + "el segundo es el " + n2 + " " + "y el mas pequeño es el " + n1);
            } else {
                System.out.println("error, el primer y el segundo numero son iguales");
            } 
        } else {
            if (n1 == n2 && n1 == n3) {
            System.out.println("error, los tres numeros son iguales");        
            }
        }
    }
}