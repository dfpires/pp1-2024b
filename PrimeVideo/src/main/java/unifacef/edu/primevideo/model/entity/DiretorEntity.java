package unifacef.edu.primevideo.model.entity;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="diretor")
public class DiretorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    @OneToMany(mappedBy = "diretor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FilmeEntity> filmes = new ArrayList<FilmeEntity>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<FilmeEntity> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<FilmeEntity> filmes) {
        this.filmes = filmes;
    }
}
