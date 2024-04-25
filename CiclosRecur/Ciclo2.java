/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;
//Escribir un programa que calcule el factorial usando recursividad para un número
//entero positivo ingresado por el usuario.
/**
 *
 * @author mplab4.pc06
 */
import java.util.Scanner;

public class Ciclo2 {
    public static int fac =1;
    
    public static void factorial(int n){
        if(n==0){
            System.out.println("el factorial es: "+fac);
            fac = 1;
            return;
        }
        fac *= n;
        factorial(n-1);
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero para calcular el factorial: ");
        numero = entrada.nextInt();
        factorial(numero);
        
        
    }
    
}
