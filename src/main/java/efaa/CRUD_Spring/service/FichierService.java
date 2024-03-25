package efaa.CRUD_Spring.service;
import efaa.CRUD_Spring.Entity.Fichier;
import efaa.CRUD_Spring.Repositoties.FichierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FichierService {
    @Autowired
    private FichierRepository fichierRepository;

    public List<Fichier> getAllFichiers() {
        return fichierRepository.findAll();
    }

    public Fichier getFichierById(Long id) {
        return fichierRepository.findById(id).orElse(null);
    }

    public Fichier addFichier(Fichier fichier) {
        return fichierRepository.save(fichier);
    }
    public Map<Long, String> getFichiersMapForCours(Long coursId) {
        List<Fichier> fichiers = fichierRepository.findByCoursId(coursId);
        return fichiers.stream()
                .collect(Collectors.toMap(Fichier::getId, f -> "Fichier " + f.getId()));
    }

    public Map<Long, String> getFichiersMapForCoursAndTypeFichier(Long coursId, Long typeFichierId) {
        List<Fichier> fichiers = fichierRepository.findByCoursIdAndTypeFichierId(coursId, typeFichierId);
        return fichiers.stream()
                .collect(Collectors.toMap(Fichier::getId, f -> "Fichier " + f.getId()));
    }
}
