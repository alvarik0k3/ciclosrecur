/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
 *
 *Escribir un programa que calcule la suma de los dígitos pares de un número entero
utilizando ciclos. Realice el ruteo para n = 1435
 */
import java.util.Scanner;
public class Ciclo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        System.out.println("ingrese un numero para sumar sus digitos: ");
        numero = entrada.nextInt();
        while (numero != 0) {
            if ((numero % 10) % 2 == 0) {
                suma = suma + numero % 10;
            }

            numero = numero / 10;

        }
        System.out.println("la suma de los digitos es: " + suma);
    }

}
