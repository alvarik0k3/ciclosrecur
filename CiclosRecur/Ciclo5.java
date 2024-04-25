/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
 *
 *Escribir un programa que determine si un año es bisiesto o no utilizando recursividad.
 */
import java.util.Scanner;

public class Ciclo5 {
        public static boolean año(int ano) {
        
        if (ano < 4) {
            return false;
        }
        
        
        if (ano == 4) {
            return true;
        }
        
        
        return año(ano - 4);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int ano = entrada.nextInt();
        
        if (año(ano)) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }
        
        
    }
    

}

