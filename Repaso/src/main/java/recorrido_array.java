import java.util.Random;

public class recorrido_array {
    static Random rnd = new Random();

    public static void main(String[] args) {
    recFilFil();
    }

    public static void recFilFil() {
        int[][] numeros = new int[5][4];

        for (int f=0; f< numeros.length; f++){
            for (int c=0; c< numeros[0].length; c++){
                numeros[f][c] = rnd.nextInt(1, 101);
            }
        }
    }


    public static void recFilFil1() {
        int[][] numeros = new int[5][4];

        for (int p=0; p< numeros.length*numeros[0].length; p++){
            numeros[p/4][p%4] = rnd.nextInt(1, 101);
        }
    }
}
