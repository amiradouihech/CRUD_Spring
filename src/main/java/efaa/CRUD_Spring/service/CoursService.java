package efaa.CRUD_Spring.service;
import efaa.CRUD_Spring.Entity.Cours;
import efaa.CRUD_Spring.Repositoties.CoursRepository;
import efaa.CRUD_Spring.Repositoties.FichierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CoursService {
    @Autowired
    private CoursRepository coursRepository;
    @SuppressWarnings("unused")
    private FichierRepository fichierRepository;
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    public Cours getCoursById(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public Map<Long, String> getCoursMapForNiveauSectionSemestre(Long niveauId, Long sectionId, Long semestreId) {
        List<Cours> cours = coursRepository.findByNiveauIdAndSectionIdAndSemestreId(niveauId, sectionId, semestreId);
        return cours.stream()
                .collect(Collectors.toMap(Cours::getId, Cours::getNom));
    }
}
