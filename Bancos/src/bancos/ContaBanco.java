package bancos;
public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual() {
        System.out.println("__  __  __  __  __  __  __  __  __  __  __  __  __");
        System.out.println("Numero da conta " + this.numeroConta);
        System.out.println("Tipo da conta " + this.tipo);
        System.out.println("Dono da conta " + this.dono);
        System.out.println("Saldo Total da Conta " + this.saldo);
        System.out.println("Estado da conta " + this.status);
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.saldo = 50;
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        
    }
    
    public void fecharConta() {
        if(saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em debito");
        } else {
            this.setStatus(false);
        }
    }
    
    public void depositar(float v) {
        if (status == true) {
            this.saldo = saldo + v;
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Inpusivel Sacar");
        }
    }
    
    public void pagarMensalidade() {
        float v = 0;
        if ("CC".equals(tipo)) {
            v = 12;
           
        } else if("CP".equals(tipo)) {
            v = 20;
            
        }
        if (status == true) {
            if (saldo > v) {
                saldo = saldo - v;
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Inpusivel pagar");
        }
        System.out.println("O senhor pagou a mensalidade de " + v);
    }

    

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
