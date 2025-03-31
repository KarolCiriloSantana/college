import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Semaforo S = new Semaforo();

        while (true){
            String  res = JOptionPane.showInputDialog("=====SEMÁFORO====== \n Ligado: " + S.getLigado() + " Cor atual: "+ S.getCor() + "\n Gostaria de mudar? \n'S' - Sim \n 'N' - Não");
            if (res.toLowerCase().equals("s")){
                S.mudarCor();
            } else if (res.toLowerCase().equals("n")){
                JOptionPane.showMessageDialog(null, "Programa encerrado");
                break;
            } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
            }
        }     
    }      

