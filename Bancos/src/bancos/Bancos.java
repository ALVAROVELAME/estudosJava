package bancos;
public class Bancos {
    public static void main(String[] args) {
        ContaBanco bradesco = new ContaBanco();
        
        bradesco.abrirConta("CC");
        bradesco.setDono("Alvaro");
        bradesco.depositar(1.500777f);
        bradesco.pagarMensalidade();
        bradesco.estadoAtual();
        
    }
    
}
