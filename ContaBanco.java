package monitoria;

public final class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    //metodos
    public void estadoAtual(){
        System.out.println("______________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Saldo > 0 - Erro ao fechar conta!");
        } else if (this.saldo == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("Saldo < 0 - Erro ao fechar conta!");
        }
    }
    public void depositar(float v) {
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Saldo depositado");
        } else {
            System.out.println("Conta está fechada, sem saldo para depositar");
        }
    }
    public void sacar(float v) {
        if(this.isStatus()){
            if(this.getSaldo() < v ){
                System.out.println("Saldo n suficiente");
            } else {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta " + this.getDono());
            }
        } else {
            System.out.println("Conta esta encerrada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Conta encerrada - OP Invalida.");
        }
    }
    
    //getters e setters

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
