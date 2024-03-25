package efaa.CRUD_Spring.Controller;
import efaa.CRUD_Spring.Entity.Section;
import efaa.CRUD_Spring.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sections")
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @GetMapping
    public ResponseEntity<List<Section>> getAllSections() {
        List<Section> sectionList = sectionService.getAllSections();
        return ResponseEntity.ok(sectionList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Section> getSectionById(@PathVariable Long id) {
        Section section = sectionService.getSectionById(id);
        return ResponseEntity.ok(section);
    }

    @PostMapping
    public ResponseEntity<Section> addSection(@RequestBody Section section) {
        Section newSection = sectionService.addSection(section);
        return ResponseEntity.ok(newSection);
    }

}
