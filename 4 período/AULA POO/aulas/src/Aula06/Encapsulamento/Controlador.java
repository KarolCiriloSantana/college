package Aula06.Encapsulamento;


//<<INTERFACE>> possui métodos abstratos quase sempre publicos e sem atributos
public interface Controlador {


    //nem sempre é void

    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
}
