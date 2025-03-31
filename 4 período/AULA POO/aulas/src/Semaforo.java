import javax.swing.JOptionPane;

public class Semaforo  implements SemaforoInterface{

    /*4. Crie uma classe Semáforo que possua os atributos cor (String) e ligado (boolean) e também deve existir um construtor que inicialize o semáforo em uma das cores validas. Além disso, deve existir uma operação  estado que imprime uma String indicando a cor atual do semáforo e uma operação  transição", obedecendo encapsulamento e as seguintes restrições: 
A) o estado do semáforo deve ser representado apenas por cores válidas (vermelho, verde ou amarelo) 
B) apenas transições válidas devem ocorrer (de verde para amarelo, de amarelo para vermelho ou de vermelho para verde) 
Obs.: Você pode de nir um intervalo de tempo para que as transições ocorram ou definir um menu onde o usuário solicite uma transição. */
  
   private String cor;
   private boolean ligado;
   
   //contrutor
    Semaforo(){
    this.cor = "amarelo";
    this.ligado = true;
   }

   //Métodos
   public String getCor(){
        return cor;
   }

   public boolean getLigado(){
        return ligado;
   }

   private void setCor(String COR){
        if (COR.toLowerCase().equals("amarelo") || COR.toLowerCase().equals("vermelho") || COR.toLowerCase().equals("verde")){
            this.cor = COR; //acho q nem precisa dessa verificação 
        }
   }

   private void setLigado(boolean ligado){
        this.ligado = true;
    }

    @Override
    public void ligar(){
        this.setLigado(true);
    }
    

   @Override
   public void mudarCor(){
        if (this.getLigado() == true) { 
            if (this.getCor().equals("amarelo")){
            setCor("vermelho");
            } else if (this.getCor().equals("vermelho")){
                setCor("verde");
            } else if (this.getCor().equals("verde")){
                setCor("amarelo");
            }
            JOptionPane.showMessageDialog(null, "Cor alterada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "O semáforo está deslidado");
        }

    }
}
