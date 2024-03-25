package efaa.CRUD_Spring.service;
import efaa.CRUD_Spring.Entity.TypeFichier;
import efaa.CRUD_Spring.Repositoties.TypeFichierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TypeFichierService {
    @Autowired
    private TypeFichierRepository typeFichierRepository;

    public List<TypeFichier> getAllTypesFichier() {
        return typeFichierRepository.findAll();
    }

    public TypeFichier getTypeFichierById(Long id) {
        return typeFichierRepository.findById(id).orElse(null);
    }

    public TypeFichier addTypeFichier(TypeFichier typeFichier) {
        return typeFichierRepository.save(typeFichier);


    }
    public Map<Long, String> getAllTypesFichierMap() {
        List<TypeFichier> typesFichier = typeFichierRepository.findAll();
        return typesFichier.stream()
                .collect(Collectors.toMap(TypeFichier::getId, TypeFichier::getNom));
    }}
