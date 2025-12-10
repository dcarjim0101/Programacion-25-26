/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejercicios;
import java.util.Scanner;
/**
 *
 * @author 02_1DAW_alum
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("cuantos años tienes?: ");
        int edad = sc.nextInt();
        
        boolean mayoredad;
        mayoredad = edad > 17;
        
        System.out.println("eres mayor de edad?: " + mayoredad);
    }
}
