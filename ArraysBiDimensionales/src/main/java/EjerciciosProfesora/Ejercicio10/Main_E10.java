package EjerciciosProfesora.Ejercicio10;

import static EjerciciosProfesora.Ejercicio10.Funciones.*;

public class Main_E10 {
    public static void main(String[] args) {
        // Matrix[SHOPS 10] [CHECKOUTS 5] [MONTHS 12]
        int[][][] dataBase = new int[10][5][12];

        fillMatrix(dataBase);
        showDataBase(dataBase);

        // Data: data[SHOP][SALES FOR MONTH]
        int[][] result = resultSalesOfCheckotsFotMonths(dataBase);
        System.out.printf("CAJAS %5s","");
        for (int cb = 0; cb < 5; cb++) {
            System.out.printf("Caja %2d | ",(cb+1));
        }
        System.out.println();
        for (int f = 0; f < result.length; f++) {
            System.out.printf("Tienda %2d ",(f+1));
            for (int c = 0; c < result[0].length; c++) {
                System.out.printf("%8d |",result[f][c]);
            }
            System.out.println();
        }

    }
}
