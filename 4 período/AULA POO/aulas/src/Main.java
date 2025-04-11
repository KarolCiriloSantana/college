import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Semaforo S = new Semaforo();

        while (true){
            String  res = JOptionPane.showInputDialog("=====   SEMÁFORO  ====== \n Ligado: " + S.getLigado() + "\n Cor atual: "+ S.getCor() + "\n\n Gostaria de mudar? \n \n'S' - Sim \n 'N' - Não");
            if (res.toLowerCase().equals("s")){
                S.mudarCor();
            } else if (res.toLowerCase().equals("n")){
                S.desligar();
                JOptionPane.showMessageDialog(null, "Ligado: "+S.getLigado() +"\n Programa encerrado");
                break;
            } else {
                    JOptionPane.showMessageDialog(null, "Resposta inválida");
            }
        }
    }     
}     

