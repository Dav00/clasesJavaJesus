package dia3.ejemploFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ricachon extends Humano {
    boolean bautizado;
    public void hablarRicachon(){
        System.out.println("Soy rico! 💸💸💸💸💸💸");
    }
}
