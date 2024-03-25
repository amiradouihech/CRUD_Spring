package efaa.CRUD_Spring.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
@Data
@Entity
@NoArgsConstructor
@Table(name = "Fichier")
public class Fichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] fichier;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private TypeFichier typeFichier;

    @ManyToOne
    @JoinColumn(name = "cours_id", nullable = false)
    private Cours cours;
}
