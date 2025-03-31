package Aula06.Modificadores;

public class Aluno {

    //Private = apenas a própria classe pode acessar

    private String nome;
    int idade;


    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        if (idade > 0 && idade < 130){
             this.idade = idade;
            System.out.println("Idade cadastrada");
        } else {
            System.out.println("Erro! Idade");
        }
       
    }



    Aluno () {}
    
}
