
package objetosjava;


public class ObjetosJava {

    
    public static void main(String[] args) {
        Tomada tomada1 = new Tomada();
        
        tomada1.cor = "branca";
        tomada1.formato = "retangular com pontas aredondadas" ;
        tomada1.desconectarEntrada();
        tomada1.status();
        tomada1.ligado();
        
        System.out.println("__  __  __  __  __  __");
        System.out.println("");
        
        Tomada tomada2 = new Tomada();
        
        tomada2.cor = "Asul";
        tomada2.formato = " redondo";
        tomada2.conectarEntrada();
        tomada2.status();
        tomada2.ligado();
        
        System.out.println("__  __  __  __  __  __  __");
        System.out.println("");
        
        Geladeira geladeira1 = new Geladeira();
        geladeira1.cor = "Azul";
        geladeira1.capacidade = 70;
        geladeira1.formato = "dublex";
        geladeira1.abrirPorta();
        geladeira1.descongelar();
        geladeira1.refrigerar();
        geladeira1.ligar();
        
        
        geladeira1.abrirFecharPorta();
        geladeira1.congelando();
        geladeira1.refrigerando();
        geladeira1.ligarDesligar();
        geladeira1.estatus();
        
    }
    
}
