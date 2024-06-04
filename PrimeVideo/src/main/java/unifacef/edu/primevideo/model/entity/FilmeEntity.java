package unifacef.edu.primevideo.model.entity;

import jakarta.persistence.*;

@Entity // entidade de banco de dados
@Table(name="filme") // tabela filme do banco de dados
public class FilmeEntity {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="anoLancamento")
    private int anoLancamento;
    @Column(name="nota")
    private float nota;



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

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
