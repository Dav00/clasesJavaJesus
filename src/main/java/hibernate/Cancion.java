package hibernate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cancion")
//Anotaciones de Lombok:
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cancion {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "titulo", nullable = false)
    String titulo;
    @Column(name = "artista", nullable = true)
    String artista;
    @Column(name = "añoPublicacion", nullable = true)
    int annoPublicacion;
}
