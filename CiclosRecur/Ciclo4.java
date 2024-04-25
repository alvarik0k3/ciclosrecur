/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
 *
 * Escribir un programa que determine si un número entero es primo o no usando ciclos.
 */
import java.util.Scanner;
public class Ciclo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int numero,contador=0;
        System.out.println("ingrese un numero para ver si es primo o no: ");
        numero = entrada.nextInt();
        for(int i =1;i <=numero;i++){
            if(numero%i==0){
                contador++;
            }
            
        }
        if(contador==2){
            System.out.println("el numero es primo");
        }
        else{
            System.out.println("el numero no es primo");
        }
    
       
    }
    
}
