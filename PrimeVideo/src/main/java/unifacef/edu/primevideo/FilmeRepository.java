package unifacef.edu.primevideo;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edu.primevideo.model.entity.FilmeEntity;

public interface FilmeRepository extends
            JpaRepository<FilmeEntity, Long> {

    // esta interface vai herdar todos os métodos de CRUD
    // relacionado a FilmeEntity
    // create, retrieve, update, delete
}
