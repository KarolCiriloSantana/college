package aula01;

import javax.swing.JOptionPane;

public class Funções {
    
    //Os métodos são funções das classes são objetos

    /*static [tippo de restorno nome (argumentos) {
        [comandos]
        return [valor de retorno];
    }] */

    static boolean paridade (int numero){
        return numero % 2 == 0; //vai gerar true ou false
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        if (paridade(n)){
            JOptionPane.showMessageDialog(null, "É par");
        } else { JOptionPane.showMessageDialog(null, "É ímpar");}
    }
    
    //static: o método pode ser chamado usando o nome da classe, sem precisar criar um objeto

}
