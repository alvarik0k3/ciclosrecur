/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
Escribir un programa que calcule la potencia usando ciclos de un número ingresado
por el usuario elevado a un exponente entero positivo también ingresado por el
usuario. Realice el ruteo para n1=3 y n2 = 4
 */
import java.util.Scanner;
public class Ciclo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,mult=1;
        System.out.println("calcular potencia: ");
        System.out.println(" ");
        System.out.println("ingrese la base: ");
        n1 = entrada.nextInt(); 
        System.out.println("ingrese el exponente: ");
        n2 = entrada.nextInt();
        if(n2 != 0){
            for(int i =0;i<=n2; i++){
                mult*=n1;
                
            }
            System.out.println("la potencia es: "+mult);
            
        }
        System.out.println("la potencia es: "+mult);
        
    }
    
}
