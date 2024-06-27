import java.util.ArrayList;

public class Exe1Biblioteca {
    private String nome;
    private ArrayList<Exe1Livro> livros;
    public Exe1Biblioteca() {
        livros = new ArrayList<Exe1Livro>();
    }
    public Exe1Biblioteca(String nome) {
        this.nome = nome;
        livros = new ArrayList<Exe1Livro>();
    }

    public void adicionaLivro(String nome){
        this.livros.add(new Exe1Livro(nome));
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Exe1Livro> getLivros() {
        return livros;
    }



    @Override
    public String toString() {
        return "Exe1Biblioteca{" +
                "nome='" + nome + '\'' +
                ", livros=" + livros +
                '}';
    }
}
