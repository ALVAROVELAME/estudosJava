
package objetosjava;


public class Tomada {
    String formato;
    String cor;
    boolean entrada;
    
    void conectarEntrada() {
        this.entrada = true;
    }
    
    void desconectarEntrada() {
        this.entrada = false;
    }
    
    void ligado() {
        if (entrada == true) {
            System.out.println("Entrada conectada");
        } else {
            System.out.println("Entrada desconectada");
        }
    }
    
    void status() {
        System.out.println("Formato " + this.formato);
        System.out.println("Cor " + this.cor);
    }
}
