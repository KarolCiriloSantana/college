package Exercícios;

import javax.swing.JOptionPane;

//12. Faça um programa que leia uma idade e verifique a classe eleitoral da pessoa (até 16 anos não pode votar, entre 16 e 18 e maior que 65 é facultativo), entre 18 e 65 eleitores obrigatório.

public class Eleição {

    public static void main(String[] args) {
        String idadestr = JOptionPane.showInputDialog("Digite a sua dade");

        int idade = Integer.parseInt(idadestr);
        if (idade > 0) {
            if ((idade >= 16 && idade < 18) || (idade > 65))  {
            JOptionPane.showMessageDialog(null, "Voto facultativo");
            } else {
                    if (idade >= 18){
                    JOptionPane.showMessageDialog(null, "Voto obrigatório");
                    } else {
                            JOptionPane.showMessageDialog(null, "Não pode votar");
                    } 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, digite um número positivo na próxima tentativa");
        } 
    }
}
