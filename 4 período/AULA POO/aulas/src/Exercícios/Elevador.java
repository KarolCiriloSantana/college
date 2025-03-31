package Exercícios;

import javax.swing.JOptionPane;

public class Elevador {
  
    private int andarAtual;
    private int terreo;
    private int andaresTotal;
    private int capacidade;
    private int pessoas;

    /* 
    int térreo;
    int andar;
    int cpcd;
    int pessoas;


       16. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. Deve existir um ////construtor padrão/// que inicializa os atributos com valores padrão e um construtor que recebe como parâmetro os dados de inicialização. 
        
        Além disso, devem existir os métodos: 
        1 - Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço); 
        2 - Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele); 
        3 - Sobe: para subir um andar (não deve subir se já estiver no último andar); 
        4 - Desce: para descer um andar (não deve descer se 5 já estiver no térreo); 
        5 - Finaliza: terminar o programa. 
        
        Encapsular todos os atributos da classe. Criar um Loop com um menu solicitando qual opção acima deve ser executada e, a cada repetição, informar os dados de andar e quantidade de pessoas.
        
        Elevador 

        Carcteristicas (atributos e tipos de dados)
         int térreo = 0;
            int andar = 1;
            int cpcd = 0;
            int pessoas = 0;
        
    
        
        
        
        */

    // Construtores 
        public void Elevador (){
            this.andarAtual = 0;
            this.pessoas = 0;
           }
       
       public Elevador(int andar, int pessoas) {
               this.andar = andar;
               this.pessoas = pessoas;
               this.cpcd = 8;
           }

    // Método para entrar no elevador
    public boolean entrar() {
        if (5 > pessoas) {
            pessoas += 1;;
            return true;
        }
        return false;
    }

    // Método para sair
    public boolean sair() {
       
        if (pessoas > 0) {
            pessoas -= 1;
            return true;
        }
        return false;
    }

    // Método para subir um andar
    public boolean subir () {
        if (12 > andar) {
            andar += 1;
            return true;
        }
        return false;
  }

    public boolean descer () {
        if (andar > 0) {
            andar -= andar;
            return true;
        }
        return false;
    }



    
}