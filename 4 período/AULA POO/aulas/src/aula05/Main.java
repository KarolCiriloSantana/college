package aula05;

import javax.swing.JOptionPane;

public class Main {

      //***********Achei estraho colocar a classe e o uso dessa classe no mesmo arquivo, achei q o Main faria uso da classe e que outra, como o Throws teria o método leitura

      //essa clase cria objetos q só executa, mas não tem atibutos

      //Jogando exceções (uma excdeção pode ocorrer mas não será tratada no momento)

      public int leitura() throws NumberFormatException { //o método leitura vai retornar um tipo primitivo int e pode jogar uma exceção (a responsabilidade de tratar a exceção vai pra quem chama o método)
        String s = JOptionPane.showInputDialog("Digite um número: ");
        int i = Integer.parseInt(s);
        return i;
    }
    public static void main(String[] args) {

        //normal 

        /*String s = JOptionPane.showInputDialog("Digite um número: ");
        int i = Integer.parseInt(s);
        JOptionPane.showMessageDialog(null, "Valor: " + i);*/

        while (true) {

            //*******Pode fazer um objeto com a classe Thows em outro arquivo?
            try{
            Main m = new Main(); //criando objeto do tipo Main, é onde o programa vai "começar"
            int i = m.leitura();
            JOptionPane.showMessageDialog(null, "Valor: " + i);
            break;
            } catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "O valor digitado foi inválido");
            } 
            
        }
        


        //Capturando exceções (try) (catch)
        //fazendo um loop

       /* while (true){
            try {
                String s = JOptionPane.showInputDialog("Digite um número inteiro: ");
                int i = Integer.parseInt(s);
                JOptionPane.showMessageDialog(null, "Valor: " + i);
                break;
            } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O valor digitado foi inválido");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado");
            }
        }*/
        

      



    }
    
}
