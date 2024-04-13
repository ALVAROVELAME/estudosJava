
package aula02b;


public class Aula02b {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tanpar();
        c1.rabiscar();
        c1.status();
        
        System.out.println("__ __ __ __ __ __ __");
        System.out.println("");
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "rostnet";
        c2.cor = "Preta";
        c2.destanpar();
        c2.rabiscar();
        c2.status();
        
    }
    
}
