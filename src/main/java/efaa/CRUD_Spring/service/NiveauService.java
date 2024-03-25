package efaa.CRUD_Spring.service;
import efaa.CRUD_Spring.Entity.Niveau;
import efaa.CRUD_Spring.Repositoties.NiveauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NiveauService {
    @Autowired
    private NiveauRepository niveauRepository;

    public List<Niveau> getAllNiveaux() {
        return niveauRepository.findAll();
    }

    public Niveau getNiveauById(Long id) {
        return niveauRepository.findById(id).orElse(null);
    }

    public Niveau addNiveau(Niveau niveau) {
        return niveauRepository.save(niveau);
    }
    public Map<Long, String> getNiveauxMap() {
        List<Niveau> niveaux = niveauRepository.findAll();
        return niveaux.stream()
                .collect(Collectors.toMap(Niveau::getId, Niveau::getNom));
    }
}
