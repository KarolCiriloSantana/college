package Aula06.Encapsulamento;

public class Main {
    
    public static void main(String[] args) {
        ControleRemoto C = new ControleRemoto();
        C.ligar(); 
        C.play();

        //Bacana colocar o set comoprivate pq não dá pra colocar um nímero específico, por exemplo
        C.abrirMenu();
       

       
    }
}
