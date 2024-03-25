package efaa.CRUD_Spring.service;
import efaa.CRUD_Spring.Entity.Semestre;
import efaa.CRUD_Spring.Repositoties.SemestreRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SemestreService {

    private SemestreRepository semestreRepository;


    public List<Semestre> getAllSemestres() {
        return semestreRepository.findAll();
    }


    public Semestre getSemestreById(Long id) {
        return semestreRepository.findById(id).orElse(null);
    }


    public Semestre addSemestre(Semestre semestre) {
        return semestreRepository.save(semestre);
    }
    public Map<Long, String> getSemestresMapForNiveau(Long niveauId) {
        List<Semestre> semestres = semestreRepository.findByNiveauId(niveauId);
        return semestres.stream()
                .collect(Collectors.toMap(Semestre::getId, Semestre::getNom));
    }
}
