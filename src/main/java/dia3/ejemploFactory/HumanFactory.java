package dia3.ejemploFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HumanFactory {
    public String crearHumano(int dinero){
        if(dinero < 5000){
            return "Soy pobre, " + dinero + " €";
        }
        else if(dinero >= 5000){
            return "Soy rico, " + dinero + " €";
        }
        else{
            return null;
        }
    }
}
