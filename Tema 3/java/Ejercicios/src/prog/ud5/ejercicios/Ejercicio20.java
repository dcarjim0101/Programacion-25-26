import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una nota del 0 al 10: ");
        int nota = scanner.nextInt();
        
        // usando switch de la manera tradicional
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("la nota es insuficiente");
                break;
            case 5:
                System.out.println("la nota es suficiente");
                break;
            case 6:
                System.out.println("la nota es bien");
                break;
            case 7,8:
                System.out.println("la nota es notable");
                break;
            case 9,10:
                System.out.println("la nota es sobresaliente");
                break;
            default:
                System.out.println("error, la nota no es valida");
        }

        // usando switch como expresion
        String resultado;
        resultado = switch (nota) {
            case 0,1,2,3,4 -> "la nota es insuficiente";
            case 5 -> "la nota es suficiente";
            case 6 -> "la nota es bien";
            case 7,8 -> "la nota es notable";
            case 9,10 -> "la nota es sobresaliente";
            default -> "error, la nota no es valida";
        };
        System.out.println(resultado);
    }
}