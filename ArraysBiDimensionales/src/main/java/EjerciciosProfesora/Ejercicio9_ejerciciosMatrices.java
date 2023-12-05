package EjerciciosProfesora;

import java.util.Random;

public class Ejercicio9_ejerciciosMatrices {
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\033[39m";
    public static final String GREEN = "\u001B[32m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    /**
     * This fuction fill the matrix with random numbers.
     * @param matrix - A array for fill in.
     */
    public static void fillMatrix(int[][] matrix) {
        Random rnd = new Random();
        int randomNumber;

        for (int f = 0; f < matrix.length; f++) {
            for (int c = 0; c < matrix[0].length; c++) {
                randomNumber = rnd.nextInt(0, 501);
                matrix[f][c] = randomNumber;
            }
        }
    }

    /**
     * Show the matrix for console.
     * @param matrix - Array to show.
     */
    public static void showMatrix(int[][] matrix, int[] sumFila, int[] sumCol, int[] bProduct, int[] data) {
        String[] month = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int monthIndex = data[1];
        String monthBestSell = month[monthIndex];

        System.out.printf("MESES %3s", "");
        for (int m = 0; m < month.length; m++) {
            System.out.printf("%11s |", month[m]);
        }
        System.out.print("       Total");
        System.out.println();
        for (int f = 0; f < matrix.length; f++) {
            System.out.printf(PURPLE + "prdt %2d |", (f + 1));
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.printf(WHITE + "%11d |", matrix[f][c]);
            }
            System.out.printf(RED + "%12d |", sumFila[f]);
            System.out.println();
        }
        System.out.printf("TOTAL %3s", "");
        for (int p = 0; p < sumCol.length; p++) {
            System.out.printf(GREEN + "%11d |", sumCol[p]);
        }
        System.out.println(RESET);
        System.out.println("La cantidad mas alta de los productos vendidos son:");
        System.out.printf("CantMax %1s", "");
        for (int p = 0; p < bProduct.length; p++) {
            System.out.printf(CYAN + "%11d |", bProduct[p]);
        }
        System.out.println();
        System.out.println(RESET+"Las mejores ventas son:");
        System.out.println("El producto mas vendido es el producto " +(data[0]+1)+", del mes: "+monthBestSell+" en la cantidad de: "+data[2]);
    }

    /**
     * Add the columns and save this data in a array.
     * @param matrix - Matrix to operate.
     * @return - A array with the data of the sums.
     */
    public static int[] sumSalesForProductInYear(int[][] matrix) {
        int[] sumMouthRows = new int[50];
        int sumator;

        for (int f = 0; f < matrix.length; f++) {
            sumator = 0;
            for (int c = 0; c < matrix[0].length; c++) {
                sumator = sumator + matrix[f][c];
            }
            sumMouthRows[f] = sumator;
        }
        return sumMouthRows;
    }

    /**
     * Add the rows and save this data in a array.
     * @param matrix - Matrix to operate.
     * @return - A array with the data of the sums.
     */
    public static int[] sumSalesForMouth(int[][] matrix) {
        int[] sumColMouth = new int[12];
        int sumator;

        for (int c = 0; c < matrix[0].length; c++) {
            sumator = 0;
            for (int f = 0; f < matrix.length; f++) {
                sumator = sumator + matrix[f][c];
            }
            sumColMouth[c] = sumator;
        }

        return sumColMouth;
    }

    /**
     * Show the best selling product of the each mouth.
     * @param matrix - Matrix for operate.
     */
    public static int[] showbestSellingProduct(int[][] matrix) {
        int max;
        int[] bestSellingProduct = new int[12];

        for (int c = 0; c < matrix[0].length; c++) {
            max = Integer.MIN_VALUE;
            for (int f = 0; f < matrix.length; f++) {
                if (matrix[f][c] > max) {
                    max = matrix[f][c];
                }
            }
            bestSellingProduct[c] = max;
        }
        return bestSellingProduct;
    }
    /**
     * Calculate the best selling product of the table.
     * @param matrix - Matrix for operate.
     */
    public static int[] bestSellingForMonth (int[][] matrix) {
        int[] data = new int[3];
        int maxValue = Integer.MIN_VALUE;

        for (int f = 0; f < matrix.length; f++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[f][c] > maxValue) {
                    maxValue = matrix[f][c];
                    data[2] = maxValue;
                    data[0] = f;
                    data[1] = c;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[][] ventas = new int[50][12];
        int[] sumRows, sumCols, bestProducts, salesForMonth;

        fillMatrix(ventas);

        sumRows = sumSalesForProductInYear(ventas);
        sumCols = sumSalesForMouth(ventas);
        bestProducts = showbestSellingProduct(ventas);
        salesForMonth = bestSellingForMonth(ventas);

        showMatrix(ventas, sumRows, sumCols, bestProducts, salesForMonth);
    }
}
