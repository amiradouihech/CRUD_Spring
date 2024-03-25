package efaa.CRUD_Spring.Repositoties;
import efaa.CRUD_Spring.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long>{
    List<Cours> findByNiveauIdAndSectionIdAndSemestreId(Long niveauId, Long sectionId, Long semestreId);
}
