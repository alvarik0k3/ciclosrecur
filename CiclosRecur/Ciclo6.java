/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosRecur;

/**
 *
 * Escribir un programa que determine si un número entero es primo o no utilizando
recursividad. Realice el ruteo para n = 7
 */
import java.util.Scanner;

public class Ciclo6 {

    public static int contador = 0;
    public static int i = 0;

    public static void numero(int n) {
        int o;
        o = n + i;
        if (n == 0) {
            if (contador == 2) {
                System.out.println("el numero es primo");
            }
            if (contador != 2) {
                System.out.println("el numero no es primo");
            }
            contador = 0;
            i = 1;
            return;

        }
        if (o % n == 0) {
            contador++;

        }

        i++;

        numero(n - 1);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primo;
        System.out.println("ingrese un numero para ver si es primo o no");
        primo = entrada.nextInt();
        numero(primo);

    }

}
