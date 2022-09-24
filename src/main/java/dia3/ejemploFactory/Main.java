package dia3.ejemploFactory;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            int input = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dinero ganas?"));
            HumanFactory hf = new HumanFactory();
            JOptionPane.showMessageDialog(null,hf.crearHumano(input));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Hubo un error.");
        }

    }
}
