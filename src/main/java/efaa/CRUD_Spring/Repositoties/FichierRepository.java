package efaa.CRUD_Spring.Repositoties;
import efaa.CRUD_Spring.Entity.Fichier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FichierRepository extends JpaRepository<Fichier, Long> {

    List<Fichier> findByCoursId(Long coursId);

    List<Fichier> findByCoursIdAndTypeFichierId(Long coursId, Long typeFichierId);
}
