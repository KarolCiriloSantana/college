package Aula06.Modificadores;

public class ContaBanco {

    public int numConta;
    protected String tipo; //cp ou cc
    private float saldo;
    private String dono;
    private boolean status;



    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }



    public float getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public void abrirConta(String tipo){ 
        this.setTipo(tipo); //métodos dentro de um método
   
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        } else if (tipo == "CP"){ 
            this.setSaldo(150);
        }
    }
       
    
    public void fecharConta(){ 
        if (this.getSaldo()> 0){
        System.out.println("A conta não será fechada pois ainda tem dinheiro");
       } else if (this.getSaldo()<0){ System.out.println("A conta não será fechada pois você está em débito");} else {this.setStatus(false);}
    }
   
   
    public void depositar(float valor){
       if (this.status == true && valor > 0){
        setSaldo(getSaldo() + valor);
      } else {
        System.out.println("Impossível depositar");
      }
    }
    
    public void sacar(float valor){
        if(this.status == true && getSaldo() > 0f  && getSaldo() >= valor){ 
          setSaldo(getSaldo() - valor);
       }
    }
 
    public void pagarMensal(String tipo){
    int v;
    if (tipo == "CC"){
        v = 12;
    } else if 
        (tipo == "CP"){
        v = 20;
    }
    if(this.status == true && getSaldo() > 0){
        setSaldo(getSaldo() - v);
    }}

    public void estadoAtual(){
        System.out.println("Número da conta: " + numConta);
        System.out.println("Tipo da conta: " + tipo);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Dono da conta: " + dono);
        System.out.println("Status da conta: " + status);
    }

}

    
