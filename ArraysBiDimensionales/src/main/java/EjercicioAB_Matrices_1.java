public class EjercicioAB_Matrices_1 {
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) {
        /*
            1. Hacer un programa que genere y escriba una matriz unitaria de orden 10.
            Una matriz unitaria de orden 10 es una matriz de 10x10 en la que todos los
            elementos valen 0, excepto los de la diagonal principal que valen 1. La
            diagonal principal es la que va de la esquina superior izquierda a la
            inferior derecha.
         */
        int[][] matrizA = new int[10][10];

        for (int f=0; f<matrizA.length; f++){
            for (int c=0; c<matrizA.length; c++){
                if (f==c){
                    matrizA[f][c] = 1;
                }
            }
        }

        for (int f= 0; f<matrizA.length; f++){
            for (int c=0; c< matrizA.length; c++){
                System.out.printf(CYAN+"%3d", matrizA[f][c]);
            }
            System.out.println();
        }
    }
}
