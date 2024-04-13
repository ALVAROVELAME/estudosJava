
package aula02b;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tanpada;
    
    void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("esta tanpada " + this.tanpada);
    
    }
    void rabiscar() {
        if (this.tanpada == true) {
            System.out.println("Erro! não posso Rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tanpar() {
        this.tanpada = true;
    }
    
    void destanpar() {
        this.tanpada = false;
    }
    
}
