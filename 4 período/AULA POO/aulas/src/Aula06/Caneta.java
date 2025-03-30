package Aula06;

//Modificadores de acessibilidade

public class Caneta {
    // + público - privado # protegido

    public String modelo; 
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;


    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void escrever(){
        if (this.tampada == true){
            System.out.println("Erro, caneta tampada");

        } else{
            System.out.println("Escrevendo");
        }
    }

    private void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro, caneta tampada");

        } else{
            System.out.println("Rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    
    
}
