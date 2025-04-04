package Aula06.Encapsulamento;

public class ControleRemoto implements Controlador {
    //como implementar classe abstratas


    private int volume;
    private boolean ligado;
    private boolean tocando;

    ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    @Override
    public void abrirMenu(){
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume " + this.getVolume()+ " ");
        for (int i = 1; i <= this.getVolume(); i +=10){
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    @Override
    public  void maisVolume(){
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public  void menosVolume(){
        if (this.isLigado()){
            this.setVolume(getVolume()-1);
        }
    }
    @Override
    public  void ligarMudo(){
        if (this.isLigado() && getVolume() >0){
            setVolume(0);
        }
    }

    @Override
    public  void desligarMudo(){
        if (this.isLigado() && getVolume() == 0){
            setVolume(25);
        }
    }

    @Override
    public  void play(){
        if (this.isLigado() && !(this.isTocando())){
            setTocando(true);
        }
    }

    @Override
    public  void pause(){
        if (this.isLigado() && this.isTocando()){
            setTocando(false);
        }
    }
    
}
