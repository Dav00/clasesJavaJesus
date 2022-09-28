package hibernate;

import lombok.*;

import javax.persistence.*;

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
    @GeneratedValue
    private Long id;
    @Column(name = "titulo", nullable = false)
    String titulo;
    @Column(name = "artista", nullable = true)
    String artista;
    @Column(name = "añoPublicacion", nullable = true)
    int annoPublicacion;

    public Cancion(String titulo, String autor, int fecha) {
        this.titulo = titulo;
        this.artista = autor;
        this.annoPublicacion = fecha;
    }

    @Override
    public String toString() {
        return id + "," + titulo + "," + artista + "," + annoPublicacion;
    }
}
