 package Aula01;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		
		int y = 5;
	    //impressao de uma string e valor da variavel
	    System.out.println("O valor da variável a: " + y);
	    
	    //declaração de um Scanner com entrada a partir da entrada do sistema
	    Scanner sc = new Scanner(System.in);
	    
	    //impressão de texto para indicar ao usuário que algo é esperado
	    System.out.println("Digite o valor inteiro ");
	    
	    //declaração da variavel b e atribuição a partir do Scanner de entrada
	    int z = sc.nextInt();
	    
	    //leitura o buffer para evitar problemas em leituras posteriores
	    sc.nextLine();
	    
		//impressão do valor da variável b
	    System.out.println(z);

		String s = sc.nextLine();

	    //impressão do valor da variável s
	    System.out.println(s);
	    
	    //fechar scanner
	    sc.close();
	    
	}

}
