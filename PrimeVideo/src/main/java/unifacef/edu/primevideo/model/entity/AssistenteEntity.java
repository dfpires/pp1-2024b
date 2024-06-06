package unifacef.edu.primevideo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="assistente")
public class AssistenteEntity extends FuncionarioEntity {

    private String area;

    // Getters e Setters
}
