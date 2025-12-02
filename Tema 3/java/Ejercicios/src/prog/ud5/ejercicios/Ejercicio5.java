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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1;
        System.out.println("introduce una nota: ");
        nota1 = sc.nextInt();
        int nota2;
        System.out.println("introduce otra nota: ");
        nota2 = sc.nextInt();
        int notafinal = nota1 + nota2;
        float notamedia = notafinal / 2F;
        System.out.println("la nota media es: " + notamedia);
    }
}
