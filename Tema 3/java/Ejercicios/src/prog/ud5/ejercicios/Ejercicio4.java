/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejercicios;

/**
 *
 * @author 02_1DAW_alum
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        short maximo = 32767;
        short otro = (short) (maximo + 1);
        
        if (otro == -32678) {
            System.out.println("es ciclico");
        } else {
            System.out.println("no es ciclico");
        }
    }
}
