//13. Faça um programa que leia um número inteiro n e indique todos os múltiplos de 5 até n.

package Exercícios;

import java.util.Scanner;


public class Múltiplos {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número 'n': ");
        int n = scanner.nextInt();
        scanner.close();
        
        int mtp = 0;

        if (n > 0){ 
            System.out.print("Múltiplos de 5 até "+ n);
            while (mtp <= n) {
            System.out.println(mtp);
            mtp += 5;
        }} else {
            System.out.print("Múltiplos de 5 até "+ n);
            mtp = 0;
            while (mtp >= n) {
                System.out.print(mtp);
                mtp -= 5;
        } 
        }
    }
}


