package actividades_ampliacion;
/**
 *
 * @author 02_1DAW_alum
 */
public class ejercicio1 {
    public static void main(String[] args) {
        // Crea una aplicación en Java para seleccionar al azar un alumno de la clase
        String[] alumnos = {"Jose", "Daniel", "Oscar", "Adrian", "Anotinio", "Alejandro", "Raul", "David"};
        
        // Tendrá que ser capaz de descartar los alumnos que ya hayan salido y de llevar la cuenta de las veces que ha salido cada alumno
        int[] contador = new int[alumnos.length];
        int totalSeleccionados = 0;
        while (totalSeleccionados < alumnos.length) {
            int indice = (int) (Math.random() * alumnos.length);
            if (contador[indice] == 0) {
                System.out.println("Alumno seleccionado: " + alumnos[indice]);
                contador[indice]++;
                totalSeleccionados++;
            }
        }
    }
}