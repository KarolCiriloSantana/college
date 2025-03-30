package aula04;

public class Main {
    public static void main(String[] args) { //programa principal

        //Objeto do tipo pesssoa com um contrutor padrão
        Pessoa karol = new Pessoa(); 
        
        //Atributos do objeto
        karol.nome = "Karol";
        karol.idade = 19;
        karol.profissão = "Estudante";
        karol.altura = 1.6f;

        //Métodos (ações do objeto)
        karol.falar("Olá Mundo");
        karol.chorar(true);
        karol.correr(5f);

        //Criando objetos utilizando construtor "normal"
        Pessoa Hugo = new Pessoa("Hugo", 23, "Farmaceutico", 1.70f);

    }
    
}
 
