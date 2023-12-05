package EjerciciosProfesora.Ejercicio10;

import java.util.Random;

public class Funciones {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\033[39m";
    /**
     * This fuction fill the matrix with random numbers.
     * @param matrix - A array for fill in.
     */
    public static void fillMatrix (int[][][] matrix) {
        Random rnd = new Random();
        // Matrix[SHOP] [CHECKOUT] [MONTH]
        for (int s = 0; s < matrix.length; s++) {
            for (int c = 0; c < matrix[0].length; c++) {
                for (int m = 0; m < matrix[0][0].length; m++) {
                    matrix[s][c][m] = rnd.nextInt(6000, 12000);
                }
            }
        }
    }
    /**
     * Show the matrix for console.
     * @param matrix Array to show.
     */
    public static void showDataBase(int[][][] matrix){
        String[] month = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (int s = 0; s < matrix.length; s++) {
            System.out.println("Tienda "+(s+1));
            System.out.println();
            //Show the month name.
            System.out.printf("MESES %1s |", "");
            for (int m = 0; m < month.length; m++) {
                System.out.printf(BLUE+"%10s |", month[m]);
            }
            System.out.println();
            //Show the sales.
            for (int c = 0; c < matrix[0].length; c++) {
                //Show the box numbrer.
                System.out.printf(PURPLE + "CB %4d |", (c + 1));
                for (int m = 0; m < matrix[0][0].length; m++) {
                    System.out.printf(CYAN+"%10d |",matrix[s][c][m]);
                }
                System.out.println(RESET);
            }
            System.out.println();
            System.out.println();
        }
    }
}
