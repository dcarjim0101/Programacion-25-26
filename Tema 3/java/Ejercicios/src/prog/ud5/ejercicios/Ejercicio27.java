import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("los multiplos de 7 entre 1 y 100 son:");
        
        //bucle para mostrar los multiplos de 7
        for (i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
        }
        }
    }
}
