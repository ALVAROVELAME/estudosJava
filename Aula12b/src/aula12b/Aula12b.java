package aula12b;
public class Aula12b {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p =  new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFisch g = new GoldFisch();
        Arara e = new Arara();
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        


        //m.setPeso(35.3f);
        //m.setCorDoPelo("Marron");
        //m.alimentar();
        //m.locomover();
        //m.emitirSom();
        
        //a.locomover();
        //p.locomover();
        //r.locomover();
    }
    
}
