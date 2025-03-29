package aula01;

import javax.swing.JOptionPane;

public class Exemplo04 {
    public static void main(String[] args) {
        //entrada a partir de um painel
        //JOpitionPane.showInputDialog("texto"); 

        //saída a partir de um painel
        //JOpitionPane.showMessageDialog(null, "texto");

        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        String idadestr = JOptionPane.showInputDialog("Digite sua idade:");

        int idade = Integer.parseInt(idadestr);

        JOptionPane.showMessageDialog(null, nome + " tem "+ idade + " anos");

    }
}
