package efaa.CRUD_Spring.Controller;
import efaa.CRUD_Spring.Entity.Fichier;
import efaa.CRUD_Spring.service.FichierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fichiers")
public class FichierController {
    @Autowired
    private FichierService fichierService;

    @GetMapping
    public ResponseEntity<List<Fichier>> getAllFichiers() {
        List<Fichier> fichierList = fichierService.getAllFichiers();
        return ResponseEntity.ok(fichierList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fichier> getFichierById(@PathVariable Long id) {
        Fichier fichier = fichierService.getFichierById(id);
        return ResponseEntity.ok(fichier);
    }

    @PostMapping
    public ResponseEntity<Fichier> addFichier(@RequestBody Fichier fichier) {
        Fichier newFichier = fichierService.addFichier(fichier);
        return ResponseEntity.ok(newFichier);
    }
}
