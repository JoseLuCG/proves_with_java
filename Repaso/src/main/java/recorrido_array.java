import java.util.Random;

public class recorrido_array {
    static Random rnd = new Random();

    public static void main(String[] args) {
        //recFilFil();
        //recFilFil1();
        //recColxCol1();
        //diagonalPrincipal();
        //diagonalSecundaria();
        //subAreaArray();
        recorridoColindante();
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

    public static void subAreaArray() {
        int[][] numeros = new int[10][8];
        int fila=4, col= 5, arco=3, fi, ff, ci, cf;
        int nc= numeros[0].length;

        fi = fila-arco; ff = fila+arco;
        ci = col - arco; cf = col + arco;
        if (fi<0) fi = 0;
        if (ci<0) ci = 0;
        if (ff>= numeros.length) ff = numeros.length-1;
        if (cf>=nc) cf = nc - 1;

        //Rellenamos el array:
        for (int f=fi; f<=ff;f++){
            for (int c=ci; c<= cf; c++){
                numeros[f][c] = rnd.nextInt(1,10);
            }
        }
    }

    public static void recorridoColindante (){
        int[][] numeros = new int[10][8];
        int f = 0, c = 1;

        if (f>0 && c>0) numeros[f-1][c-1] = rnd.nextInt(1, 10);
        if (f>0) numeros[f-1][c] = rnd.nextInt(1, 10);
        if (f>0 && c<numeros[0].length-1) numeros[f-1][c+1] = rnd.nextInt(1, 10);

        if (c>0) numeros[f][c-1] = rnd.nextInt(1, 10);
        if (c< numeros.length-1) numeros[f][c+1] = rnd.nextInt(1, 10);

        if (f< numeros.length-1 && c>0) numeros[f+1][c-1] = rnd.nextInt(1, 10);
        if (f< numeros.length-1) numeros[f+1][c] = rnd.nextInt(1, 10);
        if (f< numeros.length && c<numeros[0].length-1) numeros[f+1][c+1] = rnd.nextInt(1, 10);
    }

}