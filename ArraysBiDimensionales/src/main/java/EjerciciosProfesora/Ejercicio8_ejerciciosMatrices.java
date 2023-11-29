package EjerciciosProfesora;

import java.util.Random;

public class Ejercicio8_ejerciciosMatrices {
    static Random rnd = new Random();
    public static int randomNumber() {
        int positionRandom = rnd.nextInt(1,17);
        return positionRandom;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int couple=0;

        int c = matrix[0].length;
        for (int p = 1; p<=8; p++) {
            int rN = randomNumber();
            if (matrix[rN/c][rN%c] == 0){
                matrix[rN/c][rN%c] = p;
                couple++;
                int pareja = (couple<2) ? p-- : couple=0;
            }
        }
    }
}

