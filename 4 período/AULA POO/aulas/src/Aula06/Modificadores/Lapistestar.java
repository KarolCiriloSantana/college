package Aula06.Modificadores;

public class Lapistestar {
    public static void main(String[] args) {

        //get e set servem tipo para acessar atributos privados por meio de métodos públicos ( como intermédio como aconteceu com tampar?)
       Lapis l1 = new Lapis();

        l1.setCor("Rosa");
        l1.cor = "Azul"; //cor está público, então pode

        l1.setPonta(1.5f); //ponta está privado

        l1.status();


    }
    
}
