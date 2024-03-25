package efaa.CRUD_Spring.Controller;
import efaa.CRUD_Spring.Entity.Niveau;
import efaa.CRUD_Spring.service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/niveauxs")
public class NiveauController {
    @Autowired
    private NiveauService niveauService;

    @GetMapping
    public ResponseEntity<List<Niveau>> getAllNiveaux() {
        List<Niveau> niveauList = niveauService.getAllNiveaux();
        return ResponseEntity.ok(niveauList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Niveau> getNiveauById(@PathVariable Long id) {
        Niveau niveau = niveauService.getNiveauById(id);
        return ResponseEntity.ok(niveau);
    }

    @PostMapping
    public ResponseEntity<Niveau> addNiveau(@RequestBody Niveau niveau) {
        Niveau newNiveau = niveauService.addNiveau(niveau);
        return ResponseEntity.ok(newNiveau);
    }
}
