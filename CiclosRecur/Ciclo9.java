/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
 *Escribir un programa que calcule el producto de los dígitos de un número entero
utilizando recursividad
 
 */
import java.util.Scanner;
public class Ciclo9 {
    public static int mult =1;
    public static void producto(int n){
        if(n==0){
            System.out.println("el producto de los digitos es: "+mult);
            return;
        }
        mult = mult*(n%10);
        producto(n/10);
        
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero para ver el producto de sus digitos: ");
        numero = entrada.nextInt();
        producto(numero);
    }
    
}
