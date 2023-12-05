package EjerciciosProfesora.Ejercicio10;

import static EjerciciosProfesora.Ejercicio10.Funciones.*;

public class Main_E10 {
    public static void main(String[] args) {
        // Matrix[SHOPS 10] [CHECKOUTS 5] [MONTHS 12]
        int[][][] dataBase = new int[10][5][12];

        fillMatrix(dataBase);
        showDataBase(dataBase);
    }
}
