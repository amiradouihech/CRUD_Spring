package efaa.CRUD_Spring.Repositoties;
import efaa.CRUD_Spring.Entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SectionRepository extends JpaRepository<Section, Long> {
}
