
package aula02b;


public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tanpada;
    
    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("esta tanpada " + this.tanpada);
    
    }
    public void rabiscar() {
        if (this.tanpada == true) {
            System.out.println("Erro! não posso Rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    protected void tanpar() {
        this.tanpada = true;
    }
    
    protected void destanpar() {
        this.tanpada = false;
    }
    
}
