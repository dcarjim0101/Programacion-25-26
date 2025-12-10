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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int esteanio;
        System.out.println("que año es este?: ");
        esteanio = sc.nextInt();
        int anionacimiento;
        System.out.println("en que año has nacido?: ");
        anionacimiento = sc.nextInt();
        int anios = esteanio - anionacimiento;
        System.out.println("el usuario tiene: " + anios + "años");
    }
}
