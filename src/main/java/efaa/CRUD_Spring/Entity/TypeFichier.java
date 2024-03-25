package efaa.CRUD_Spring.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name= "TypeFichier")
public class TypeFichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    public TypeFichier(String nom) {
        this.nom = nom;
    }

}
