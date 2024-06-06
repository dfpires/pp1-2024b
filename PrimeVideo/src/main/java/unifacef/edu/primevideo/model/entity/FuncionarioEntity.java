package unifacef.edu.primevideo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class FuncionarioEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String email;
        private double salario;

        // Getters e Setters
    }

