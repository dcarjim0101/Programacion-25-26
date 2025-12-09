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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        float notamedia;
        
        System.out.println("introduce la nota del primer trimestre: ");
        nota1 = sc.nextInt();
        
        System.out.println("introduce la nota del primer trimestre: ");
        nota2 = sc.nextInt();
        
        System.out.println("introduce la nota del primer trimestre: ");
        nota3 = sc.nextInt();      
        
        notamedia = (float)(nota1 + nota2 + nota3) / 3);
        
        System.out.println("la nota del primer trimestre es " + nota1 + ", " + "la nota del segundo trimestre es " + nota2 + "y " + "la nota del tercer trimestre es " + nota3);
        
        System.out.println("la nota final es: " + notamedia);
        
    }
}
