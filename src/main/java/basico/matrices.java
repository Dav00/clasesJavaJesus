package basico;

public class matrices {
    public static void main(String[] args) {
        int[][] temperaturas = new int[3][3];
        for (int i = 0; i < temperaturas.length; i++){
            for (int j = 0; j < temperaturas[i].length; j++){
                temperaturas[i][j] = (int) (Math.random() * 20);
                System.out.print(temperaturas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
