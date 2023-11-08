import java.util.Random;

public class recorrido_array {
    static Random rnd = new Random();

    public static void main(String[] args) {
        //recFilFil();
        //recFilFil1();
        //recColxCol1();
        //diagonalPrincipal();
        diagonalSecundaria();

    }

    /**
     * Recorrido de un array fila a fila a traves de dos bucles.
     */
    public static void recFilFil() {
        int[][] numeros = new int[5][4];

        for (int f=0; f< numeros.length; f++){
            for (int c=0; c< numeros[0].length; c++){
                numeros[f][c] = rnd.nextInt(1, 101);
            }
        }
    }

    /**
     * Recorrido de un array fila a fila solo con un bucle.
     */
    public static void recFilFil1() {
        int[][] numeros = new int[5][4];
        int c = numeros[0].length;

        for (int p=0; p< numeros.length*numeros[0].length; p++){
            numeros[p/c][p%c] = rnd.nextInt(1, 101);
        }
    }

    /**
     * Recorrido de un array columna a columna con dos bucles.
     */
    public static  void recColxCol(){
        int[][] numeros = new int[5][4];

        for (int c=0; c< numeros[0].length; c++){
            for (int f=0; f< numeros.length; f++){
                numeros[f][c] = rnd.nextInt(1, 101);
            }
        }
    }

    /**
     * Recorrido de un array columna a columna con un solo bucle.
     */
    public static  void recColxCol1(){
        int[][] numeros = new int[5][4];
        int f = numeros.length;

        for (int p=0; p< numeros.length*numeros[0].length; p++){
            numeros[p%f][p/f] = rnd.nextInt(1, 101);
        }
    }

    /**
     * Recorre la diagonal principal del array
     */
    public static void diagonalPrincipal(){
        int[][] numeros = new int[4][4];

        for (int p = 0; p < numeros.length ; p++) {
            numeros[p][p] = rnd.nextInt(1, 101);
        }
    }

    /**
     * Recorre la diagonal secundaria del array.
     */
    public static void diagonalSecundaria() {
        int[][] numeros = new int[4][4];
        int c = numeros[0].length-1;
        for (int p = 0; p < numeros.length ; p++) {
            numeros[p][c] = rnd.nextInt(1, 101);
            c--;
        }
    }
}