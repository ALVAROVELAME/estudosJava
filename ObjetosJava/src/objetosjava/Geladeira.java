
package objetosjava;


public class Geladeira {
    String formato;
    String cor;
    boolean porta;
    boolean tomada;
    boolean congelador;
    boolean refrigerador;
    int capacidade;
    
    
    void capasidadeCarga() {
        System.out.println( "Capacidade "+this.capacidade +"%");
    }
    void estatus() {
        System.out.println("Formato " + this.formato);
        System.out.println("Cor " + this.cor);
        capasidadeCarga();
    }
    
    void ligarDesligar() {
        if (tomada == true) {
            System.out.println("A tomada esta ligada");
        } else {
            System.out.println("A tomada esta desligada");
        }
    }
    void ligar() {
        this.tomada = true;
    }
    void desligar() {
        this.tomada = false;
    }
    
    void abrirFecharPorta() {
        if(porta == true) {
            System.out.println("A porta esta Aberta");
        } else {
            System.out.println("A porta esta fechada");
        }
    }
    void abrirPorta() {
        this.porta = true;
    }
    void fexarPorta() {
        this.porta = false;
    }
    
    void congelando() {
        if(congelador == true) {
            System.out.println(" o congelador esta congelando");
        } else { 
            System.out.println("O congelador não esta congelando");
        }
    }
    void congelar() {
        this.congelador = true;
    }
    void descongelar() {
        this.congelador = false;
    }
    
    void refrigerando() {
        if (refrigerador == true) {
            System.out.println("A geladeira Esta refrigerando");
        } else {
            System.out.println("A geladeira não esta refrigerando");
        }
    }
    void refrigerar() {
        this.refrigerador = true;
    }
    void desRefrigerar() {
        this.refrigerador = false;
    }
}
