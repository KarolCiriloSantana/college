package Aula06.Modificadores;

public class ContaBancoteste {
    public static void main(String[] args) {
        ContaBanco C1 = new ContaBanco();
        
        C1.abrirConta("CP");
        C1.setNumConta(1111);
        C1.setDono("Karol");

        C1.depositar(100);
       

        C1.estadoAtual();
    }

    
}
