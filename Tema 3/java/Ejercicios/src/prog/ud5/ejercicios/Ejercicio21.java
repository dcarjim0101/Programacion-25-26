import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un mes del año: ");
        int mes = scanner.nextInt();

        // usando switch de la manera tradicional
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("el mes tiene 31 días.");
                break;
            case 4, 6, 9, 11:
                System.out.println("el mes tiene 30 días.");
                break;
            case 2:
                System.out.println("el mes tiene 28 o 29 días.");
                break;
            default:
                System.out.println("error, el mes no es valido.");
        }

        // usando switch como expresión
        String resultado;
        resultado = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> "el mes tiene 31 días.";
            case 4, 6, 9, 11 -> "el mes tiene 30 días.";
            case 2 -> "el mes tiene 28 o 29 días.";
            default -> "error, el mes no es valido.";
        };
        System.out.println(resultado);
    }
}
