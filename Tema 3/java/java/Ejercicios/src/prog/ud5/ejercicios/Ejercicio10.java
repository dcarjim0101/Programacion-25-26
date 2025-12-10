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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int venta1manzanas;
        int venta1peras;
        int venta2manzanas;
        int venta2peras;
        int venta3manzanas;
        int venta3peras;
        float ventamanzanas;
        float ventaperas;
        
        System.out.println("cuantos kilos de manzanas se han vendido en el primer semestre?: ");
        venta1manzanas = sc.nextInt();
        System.out.println("cuantos kilos de manzanas se han vendido en el segundo semestre?: ");
        venta2manzanas = sc.nextInt();
        System.out.println("cuantos kilos de manzanas se han vendido en el tercer semestre?: ");
        venta3manzanas = sc.nextInt();
        
        ventamanzanas = (venta1manzanas + venta2manzanas + venta3manzanas) * 2.35F;
        
        System.out.println("importe total de la venta de manzanas: " + ventamanzanas);
        
        System.out.println("cuantos kilos de peras se han vendido en el primer semestre?: ");
        venta1peras = sc.nextInt();
        System.out.println("cuantos kilos de peras se han vendido en el segundo semestre?: ");
        venta2peras = sc.nextInt();
        System.out.println("cuantos kilos de peras se han vendido en el tercer semestre?: ");
        venta3peras = sc.nextInt();
        
        ventaperas = (venta1peras + venta2peras + venta3peras) * 1.95F;
        
        System.out.println("importe total de la venta de peras: " + ventaperas);
    }
}
