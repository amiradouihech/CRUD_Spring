package efaa.CRUD_Spring.Controller;
import efaa.CRUD_Spring.Entity.Cours;
import efaa.CRUD_Spring.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    private CoursService coursService;

    @GetMapping
    public ResponseEntity<List<Cours>> getAllCours() {
        List<Cours> coursList = coursService.getAllCours();
        return ResponseEntity.ok(coursList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cours> getCoursById(@PathVariable Long id) {
        Cours cours = coursService.getCoursById(id);
        return ResponseEntity.ok(cours);
    }

    @PostMapping
    public ResponseEntity<Cours> addCours(@RequestBody Cours cours) {
        Cours newCours = coursService.addCours(cours);
        return ResponseEntity.ok(newCours);
    }

}
