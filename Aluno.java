//Aluno.java

/**
  * @author Systems-RS
 */
public class Aluno {
   
    private int id_aluno,idade,serie;
    private String nome;
 
    public Aluno(int id_aluno, int idade, int serie, String nome) {
        this.id_aluno = id_aluno;
        this.idade = idade;
        this.serie = serie;
        this.nome = nome;
    }
 
    public int getIdade() {
        return idade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public int getSerie() {
        return serie;
    }
 
    public void setSerie(int serie) {
        this.serie = serie;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
}
 
