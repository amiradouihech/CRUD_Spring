package efaa.CRUD_Spring.Repositoties;

import efaa.CRUD_Spring.Entity.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Long> {
    List<Semestre> findByNiveauId(Long niveauId);
}
