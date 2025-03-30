package Aula06;

public class canetatestar {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic cristal"; //atributos publicos
        c1.cor = "Azul";
        //c1.ponta = 0.5f; está como privado
        c1.carga = 2;
        //c1.tampada = true;
        
        c1.status();

        c1.tampar();
        c1.destampar(); //não se pode mecher no tampar por aqui já que está como private, mas os métodos que estão como publicos podem acessar já que estão na mesma classe do atributo "private boolean tampar", é como se fosse um intermédio

        c1.escrever();
        //c1.rabiscar();



    }
    
    //c1.escrever();
}
