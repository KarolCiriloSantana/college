package Exercícios;

import java.util.Scanner;
public class CalcularIMC {
    
    public static void main(String[] args) {
        System.out.println("Calcular O IMC");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a sula altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Informe o seu peso: ");
        double peso = scanner.nextDouble();
        scanner.close();

        double IMC = peso / (altura * altura);
        System.out.printf("O seu IMC é: %.2f",IMC);
    }
}
    

