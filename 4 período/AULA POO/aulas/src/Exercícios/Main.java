package Exercícios;

import javax.swing.JOptionPane;

public class Main {

    ///onde se usa a classe e cria objetos
    public static void main(String[] args) {
         
        Elevador elevador = new Elevador();
    do { 
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Entra: para acrescentar uma pessoa no elevador;\n" +
            "2 - Sai: para remover uma pessoa do elevador; \n" + "3 - Sobe: para subir um andar;\n" + "4 - Desce: para descer um andar;\n" + "5 - Finaliza: terminar o programa. \n " +"Total de pessoas: "+elevador.getPessoas()+"\n;" +"Andar: "+elevador.getAndar+";\n"));

           switch (menu) {
            case 1:       
                elevador.entrar();
                break;

            case 2:
                elevador.sair();
                break;
        
            case 3:
                elevador.subir();
                break;
        
            case 4:
                elevador.descer();
                 break;

            case 5:
            JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
            } while (menu != 5);
           
           
        } 
 
    }
}

