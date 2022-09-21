package dia3;

import java.io.*;

public class TrabajarConArchivos {
    public static void main(String[] args) {
        try{
            File archivo = new File("src/main/java/dia3/ejemplo.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String textoCompleto = "";
            while((linea = br.readLine()) != null){
                //Debug: System.out.println(linea.split("\\s")[0]);
                textoCompleto = textoCompleto + linea.split("\\s")[0] + "\n";
            }
            escribirEnArchivo(textoCompleto);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void escribirEnArchivo(String texto){
        try{
            FileWriter fw = new FileWriter("src/main/java/dia3/codigospostales.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println(texto);
            fw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
