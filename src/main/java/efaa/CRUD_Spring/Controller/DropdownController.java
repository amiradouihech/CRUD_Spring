package efaa.CRUD_Spring.Controller;

import efaa.CRUD_Spring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
@CrossOrigin(origins = "http://localhost:4200")
public class DropdownController {
    
    @Autowired
    private SemestreService semestreService;

    @Autowired
    private NiveauService niveauService;

    @Autowired
    private SectionService sectionService;

    @Autowired
    private CoursService coursService;

    @Autowired
    private TypeFichierService typeFichierService; 

    @Autowired
    private FichierService fichierService; 

    // Endpoint pour récupérer les semestres associés à un niveau
    @GetMapping("/semestres/{niveauId}")
    public ResponseEntity<Map<Long, String>> getSemestresForNiveau(@PathVariable Long niveauId) {
        Map<Long, String> semestresMap = semestreService.getSemestresMapForNiveau(niveauId);
        return ResponseEntity.ok(semestresMap);
    }

    // Endpoint pour récupérer les niveaux
    @GetMapping("/niveaux")
    public ResponseEntity<Map<Long, String>> getNiveaux() {
        Map<Long, String> niveauxMap = niveauService.getNiveauxMap();
        return ResponseEntity.ok(niveauxMap);
    }

    // Endpoint pour récupérer les sections associées à un niveau
    @GetMapping("/sections/{niveauId}")
    public ResponseEntity<Map<Long, String>> getSectionsForNiveau(@PathVariable Long niveauId) {
        Map<Long, String> sectionsMap = sectionService.getSectionsMapForNiveau(niveauId);
        return ResponseEntity.ok(sectionsMap);
    }

    // Endpoint pour récupérer les cours associés à un niveau, une section et un semestre
    @GetMapping("/cours/{niveauId}/{sectionId}/{semestreId}")
    public ResponseEntity<Map<Long, String>> getCoursForNiveauSectionSemestre(
            @PathVariable Long niveauId, @PathVariable Long sectionId, @PathVariable Long semestreId) {
        Map<Long, String> coursMap = coursService.getCoursMapForNiveauSectionSemestre(niveauId, sectionId, semestreId);
        return ResponseEntity.ok(coursMap);
    }

    // Endpoint pour récupérer les types de fichier
    @GetMapping("/typesfichier")
    public ResponseEntity<Map<Long, String>> getAllTypesFichier() {
        Map<Long, String> typesFichierMap = typeFichierService.getAllTypesFichierMap();
        return ResponseEntity.ok(typesFichierMap);
    }

    // Endpoint pour récupérer les fichiers associés à un cours
    @GetMapping("/fichiers/{coursId}")
    public ResponseEntity<Map<Long, String>> getFichiersForCours(@PathVariable Long coursId) {
        Map<Long, String> fichiersMap = fichierService.getFichiersMapForCours(coursId);
        return ResponseEntity.ok(fichiersMap);
    }
    @GetMapping("/fichiers/{coursId}/{typeFichierId}")
public ResponseEntity<Map<Long, String>> getFichiersForCoursAndTypeFichier(
        @PathVariable Long coursId, @PathVariable Long typeFichierId) {
    Map<Long, String> fichiersMap = fichierService.getFichiersMapForCoursAndTypeFichier(coursId, typeFichierId);
    return ResponseEntity.ok(fichiersMap);
}
}
