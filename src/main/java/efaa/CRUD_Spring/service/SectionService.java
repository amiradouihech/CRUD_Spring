package efaa.CRUD_Spring.service;
import efaa.CRUD_Spring.Entity.Section;
import efaa.CRUD_Spring.Repositoties.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class SectionService {
    @Autowired
    private SectionRepository sectionRepository;

    public List<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    public Section getSectionById(Long id) {
        return sectionRepository.findById(id).orElse(null);
    }

    public Section addSection(Section section) {
        return sectionRepository.save(section);
    }

    public Map<Long, String> getSectionsMapForNiveau(Long niveauId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getSectionsMapForNiveau'");
    }
}
