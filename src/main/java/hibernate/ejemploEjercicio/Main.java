package hibernate.ejemploEjercicio;

import hibernate.Cancion;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class Main {
    public static void main(String[] args) {
        int input = 0;

        while(true){
            try{
                String inputString = JOptionPane.showInputDialog(null,"Elige una opción:"
                        +"\n 1) Ver Canciones en BBDD"
                        + "\n 2) Crear Cancion en BBDD");
                if(inputString == null){
                    System.exit(1); //Terminar la applicación
                }
                input = Integer.parseInt(inputString);
                String pepito = String.valueOf(1);
                float decimal = Float.parseFloat("1");
            }
            catch (Exception e){
                System.out.println("Por favor, introduce un valor correcto.");
            }
            BBUtils bbUtils = new BBUtils();
            switch (input){
                case 1: mostrarScrolleable(); break; //mostrarCanciones
                case 2: BBUtils.guardarCancion(pedirInfoCancion()); break; //guardarCanciones
            }
        }

    }
    public static Cancion pedirInfoCancion(){
        try{
            String titulo = JOptionPane.showInputDialog("¿Cual es el titulo de la canción?");
            String autor = JOptionPane.showInputDialog("¿Cual es el autor de la canción?");
            int fecha = Integer.parseInt(JOptionPane.showInputDialog("¿En que año se creó la canción?"));
            return new Cancion(titulo, autor, fecha);
        }
        catch (Exception e){
            System.err.println("pedirInfoCancion_Error");
            return null;
        }
    }
    public static void mostrarScrolleable(){
        JTextArea textArea = new JTextArea(devolverTextoFormateado());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
        JOptionPane.showMessageDialog(null, scrollPane, "Todas las canciones", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String devolverTextoFormateado(){
        StringBuilder resultado = new StringBuilder();
        if(BBUtils.verCanciones() != null){
            for (Object c: BBUtils.verCanciones()) {
                resultado.append(c.toString() + "\n");
            }
        }
        return resultado.toString();
    }
}
