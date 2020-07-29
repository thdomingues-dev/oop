package monitoria;

public final class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampa;

    public Caneta(String modelo, float ponta, String cor) {
        this.setModelo(modelo);
        this.ponta = ponta;
        this.cor = cor;
        this.tampa = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
       
    public void status() {
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo - " + this.getModelo());
        System.out.println("Ponta - " + this.getPonta());
        System.out.println("Cor - " + this.cor);
        System.out.println("Tampa: " + this.tampa);
    }
}
