package dia3.ejemploFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pobre extends Humano {
    boolean embargado;
    public void hablarPobre() {
        System.out.println("Soy pobre 🐀🐀🐀");
    }
}
