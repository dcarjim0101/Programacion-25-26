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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float PI;
        PI = 3.14F;
        double radio;
        System.out.println("introduce un radio: ");
        radio = sc.nextDouble();
        double longitud = radio * 2 * PI;
        System.out.println("la longitud mide: " + longitud);
        double area = (radio * radio) * PI;
        System.out.println("el area mide: " + area);
    }
}
