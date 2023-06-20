/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilasbi;
import java.util.Stack;
import java.util.Scanner;


/**
 *
 * @author leona
 */



public class DecialABinario {
    public static String decialBinario(int decimal) {
        Stack<Integer> stack = new Stack<>();

        if (decimal == 0) {
            stack.push(0);
        }

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binario = new StringBuilder();
        while (!stack.isEmpty()) {
            binario.append(stack.pop());
        }

        return binario.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        String binario = decialBinario(numero);
        System.out.println("El número binario de " + numero + " es: " + binario);
    }
}


