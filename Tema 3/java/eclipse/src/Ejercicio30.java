import java.util.Scanner;

public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
        System.out.println("introduce un numero: ");
        n = sc.nextInt();
        int i = 1;
        while (n > 0) {
        	for (i = n; i <= n; i--) {
        		System.out.println("*" + i);
            }
        }
        
	}
}