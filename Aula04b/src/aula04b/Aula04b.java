package aula04b;
public class Aula04b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC",0.4f, "Amarelo");
        c1.estatus();
        System.out.println("");
        Caneta c2 = new Caneta("KKK",1.5f, "Laranja");
        c2.estatus();
        
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();
        System.out.println("Tenho uma caneta " +
                c1.getModelo() + " De ponta " +
                c1.getPonta()); */
    }
    
}
