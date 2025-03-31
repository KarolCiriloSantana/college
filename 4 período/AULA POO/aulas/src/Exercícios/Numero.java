package Exercícios;

import java.util.Scanner;

//Faça uma função que leia um número inteiro e indique todos os seus divisores.
public class Numero {
 
    int num;

    Numero(){};

    public void divisor(int n){
    
        
        if (n == 0){
            System.out.println("Todos os números inteiros (exceto zero) são divisores de zero");
           return;
        }
        else if (n < 0){
            num = n * (-1);
        } else {
            num = n;
        }

        System.out.println("--- DIVISORES ---");
       
        for (int c = 1; c <= num; c++) {
            if (num % c == 0){
                System.out.print(c+" | ");
                System.out.println("-"+c);
            }
        }
    } 
            
        

    public static void main(String[] args){
         
            Numero C = new Numero();
            Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um número: ");
          
            int n = scanner.nextInt();
            C.divisor(n);
        } catch (java.util.InputMismatchException e){
            System.out.println("Erro! Formato inválido.");
        }  finally {
            scanner.close();
        }
    }
    
}
