/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejercicios;

/**
 *
 * @author 02_1DAW_alum
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        boolean opcion1;
        opcion1 = 3 <= 5 && 2==2;
        System.out.println(opcion1);
        
        boolean opcion2;
        opcion2 = 3 <= 5 && 2>10;
        System.out.println(opcion2);
        
        boolean opcion3;
        opcion3 = 1!=2||5<3;
        System.out.println(opcion3);
        
        boolean opcion4;
        opcion4 = !(1<2);
        System.out.println(opcion4);
    }
}
