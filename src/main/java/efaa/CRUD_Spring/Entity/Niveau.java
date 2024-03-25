package efaa.CRUD_Spring.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
@Data
@Entity
@NoArgsConstructor
@Table(name = "Niveau")
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
}
