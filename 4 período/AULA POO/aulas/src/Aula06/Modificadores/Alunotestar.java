package Aula06.Modificadores;

public class Alunotestar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        //aluno1.nome = "Karol"; //atribuição direta

        aluno1.setNome("Karol"); //atribuião com set já que o nome tá private

        System.out.println(aluno1.getNome());

        aluno1.setIdade(19);
        aluno1.setIdade(-2);
    }
    
}
