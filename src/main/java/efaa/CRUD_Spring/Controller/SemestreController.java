package efaa.CRUD_Spring.Controller;
import efaa.CRUD_Spring.Entity.Semestre;
import efaa.CRUD_Spring.service.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/semestres")
public class SemestreController {
    @Autowired
    private SemestreService semestreService;

    @GetMapping
    public ResponseEntity<List<Semestre>> getAllSemestres() {
        List<Semestre> semestreList = semestreService.getAllSemestres();
        return ResponseEntity.ok(semestreList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Semestre> getSemestreById(@PathVariable Long id) {
        Semestre semestre = semestreService.getSemestreById(id);
        return ResponseEntity.ok(semestre);
    }

    @PostMapping
    public ResponseEntity<Semestre> addSemestre(@RequestBody Semestre semestre) {
        Semestre newSemestre = semestreService.addSemestre(semestre);
        return ResponseEntity.ok(newSemestre);
    }

}
