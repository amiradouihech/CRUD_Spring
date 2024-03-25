package efaa.CRUD_Spring.Controller;

import efaa.CRUD_Spring.Entity.TypeFichier;
import efaa.CRUD_Spring.service.TypeFichierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typesfichiers")
public class TypeFichierController {

    @Autowired
    private TypeFichierService typeFichierService;

    @GetMapping
    public ResponseEntity<List<TypeFichier>> getAllTypesFichier() {
        List<TypeFichier> typesFichier = typeFichierService.getAllTypesFichier();
        return ResponseEntity.ok(typesFichier);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeFichier> getTypeFichierById(@PathVariable Long id) {
        TypeFichier typeFichier = typeFichierService.getTypeFichierById(id);
        return ResponseEntity.ok(typeFichier);
    }

    @PostMapping
    public ResponseEntity<TypeFichier> addTypeFichier(@RequestBody TypeFichier typeFichier) {
        TypeFichier newTypeFichier = typeFichierService.addTypeFichier(typeFichier);
        return ResponseEntity.ok(newTypeFichier);
    }
}
