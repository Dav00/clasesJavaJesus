package utils;

public class RandomUtils {
    public static int numeroAleatorioMax100(){
        return (int) (Math.random() * 100);
    }

    public int numeroAleatorioParametrizado(int max){
        return (int) (Math.random() * max);
    }
}
