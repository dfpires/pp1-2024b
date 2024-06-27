public class Exe1Livro {
    private String nome;
    public Exe1Livro(){

    }
    public Exe1Livro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Exe1Livro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
