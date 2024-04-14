package ultraemojiconbate;
public class Lutador {
    //Atributos
    private String nome, nacionalidade,categoria;
    private int idade, vitorias, derrotas, enpates;
    private float altura, peso;
    //Metudos Publicos
    public void apresentar() {
        System.out.println("-------------------------------------------------");
        System.out.println("CHEGOU a Hora , Apresentamos o Lutador " + this.getNome());
        System.out.println("Diretamente de " + this.nacionalidade);
        System.out.println("com " + this.idade + " anos e " + this.altura + " Metros");
        System.out.println("Pesando " + this.getPeso() + " Kilos");
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas e ");
        System.out.println(this.getEnpates() + " Enpates!");
    }
    public void estatus() {
        System.out.println("--------------------------------------------------");
        System.out.println(this.getNome() + " E um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Veses");
        System.out.println("Perdeu " + this.getDerrotas() + " veses");
        System.out.println("Enpatou " + this.getEnpates() + " Veses");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void enpatarLuta() {
        this.setEnpates(this.getEnpates() + 1);
    }
    
    //Metudos especiais

    public Lutador(String nome, String nacionalidade,
            int idade, int vitorias, int derrotas,
            int enpates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.enpates = enpates;
        this.altura = altura;
        this.setPeso(peso);
    }
    
    // betes e setes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEnpates() {
        return enpates;
    }

    public void setEnpates(int enpates) {
        this.enpates = enpates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    
}
