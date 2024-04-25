/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
 *Escribir un programa que determine si un año es bisiesto o no utilizando ciclos.
 
 */
import java.util.Scanner;

public class Ciclo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int year = scanner.nextInt();
        
        boolean esBisiesto = false;
        
        for (int i = 4; i <= year; i += 4) {
            if (i == year) {
                esBisiesto = true;
                break;
            }
        }
        
        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
        
        
    }
}
    

