package projetopessoas;
public class Aluno extends Pessoas{
    private int matricula;
    private String curso;
    
    public void canselarMatricula() {
        System.out.println("Matricula Canselada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
