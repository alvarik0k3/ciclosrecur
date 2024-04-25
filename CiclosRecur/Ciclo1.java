/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;
//Escribir un programa usando ciclos que calcule la suma de los números naturales
//desde 1 hasta n, donde n es un número ingresado por el usuario. Realice el ruteo para
//n= 10.
/**
 *
 * @author mplab4.pc06
 */

import java.util.Scanner;

public class Ciclo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma =0;
        String op="1",ops;
        while(op.equals("1")){
            System.out.println("1. Ingresar numero natural: ");
            System.out.println("2. Salir.");
            ops = entrada.nextLine();
            if(ops.equals("1")){
                System.out.println("ingrese el numero natural para realizaar la suma: ");
                numero = entrada.nextInt();
                if(numero >0){
                    for(int i = 0;i<=numero;i++){
                        suma+=i;
                    }
                    System.out.println("la suma de los numero naturales es: "+suma);
                }
                else{
                    System.out.println("ingrese un numero natural");
                }
                
                
                
            }
            if(ops.equals("2")){
                op = "ewrwer";
                
            }
            else{
                System.out.println("ingrese una opcion valida");
            }
            
                        
        }
        
        
        
    }
    
}
