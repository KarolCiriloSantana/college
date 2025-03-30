package Aula06;

public class Lapis {
    public String cor;
    private float ponta;


    public String setCor(String cor){
        return this.cor = cor;
    }

    public float setPonta(float ponta){
        return this.ponta = ponta;
    }

    public String getCor(){
        return this.cor;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
    }
    
}
