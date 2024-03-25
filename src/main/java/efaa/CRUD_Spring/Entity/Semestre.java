package efaa.CRUD_Spring.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Data
@Entity
@NoArgsConstructor
@Table(name = "Semestre")
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "niveau_id", nullable = false)
    private Niveau niveau;
}
