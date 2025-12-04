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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.println("introduce un numero");
        n1 = sc.nextInt();
        System.out.println("introduce otro numero");
        n2 = sc.nextInt();
        
        if (n1 > n2)
            System.out.println("el numero mayor es el " + n1);
        else 
            System.out.println("el numero mayor es el " + n2);
    }
}
