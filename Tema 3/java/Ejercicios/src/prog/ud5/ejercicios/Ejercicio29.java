public class Ejercicio29 {
    public static void main(String[] args) {
        // tablas de multiplicar del 1 al 10
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
