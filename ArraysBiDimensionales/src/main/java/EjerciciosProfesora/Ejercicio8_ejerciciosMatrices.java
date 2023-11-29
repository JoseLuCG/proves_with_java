package EjerciciosProfesora;

import java.util.Random;

public class Ejercicio8_ejerciciosMatrices {
    static Random rnd = new Random();
    public static int randomNumber() {
        int positionRandom = rnd.nextInt(0,16);
        return positionRandom;
    }
    public static void stuffedMatrix (int [][] matrix){
        int c = matrix[0].length;
        int couple=0;

        for (int p = 1; p<=8; p++) {
            int rN = randomNumber();
            if (matrix[rN/c][rN%c] == 0){
                matrix[rN/c][rN%c] = p;
                couple++;
                if (couple<2) { p--;
                }else { couple=0;}
            }else p--;
        }
    }
    public static void printMatrix ( int[][] matrix){
        for (int f = 0; f < matrix.length; f++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.printf("%3d",matrix[f][c]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        stuffedMatrix(matrix);
        printMatrix(matrix);
    }
}

