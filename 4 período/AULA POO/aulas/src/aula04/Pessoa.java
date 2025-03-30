package aula04;


public class Pessoa {

        ///não tem main
      

       
        /// Atributos
        String nome;
        int idade;
        String profissão;
        float altura;

        //Construtor - permite inicializar o estado do objeto (valores)
        //Construtor padrão (existe sem criar, mas se add o outro tem que escrever esse)
        Pessoa () {}

        //Construtor
        Pessoa(String nome, int idade, String profissão, float altura) {
            this.nome = nome; //this faz referência aos atributros, então isso será fornecido para a classe
            this.idade = idade;
            this.profissão = profissão;
            this.altura = altura;
        }

        ///Métodos
        void falar(String frase) {
            System.out.println(frase);
        }

        void chorar(boolean cry){
            if (cry){
               System.out.println("Chora não, bb");
            } else {
                System.out.println("respeito muito as minhas lágrimas, mas ainda mais minha risada");
            }  
        }

        void correr(float velocidade){
            System.out.println("Correndo a "+ velocidade + "km/h");
        }
 
}
