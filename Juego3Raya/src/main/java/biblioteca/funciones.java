package biblioteca;

public class funciones {
    /**
     * Funcion que recorre la matriz fila a fila para el jugador 1.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoLineaJ1 (char[][] matriz, boolean victoryCondition){
        int winXCounter=0;
        for (int f=0; f< matriz.length;f++){
            winXCounter=0;
            for (int c=0; c< matriz[0].length; c++){
                if (matriz[f][c] == 'x'){
                    winXCounter++;
                    if (winXCounter == 3) {
                        victoryCondition= true;
                        System.out.println("Jugaor 1, has ganado la partida.");
                    }
                }
            }
        }
        return victoryCondition;
    }
    /**
     * Funcion que recorre la matriz fila a fila para el jugador 2.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridooLineaJ2 (char[][] matriz, boolean victoryCondition){
        int winOCounter;
        for (int f=0; f< matriz.length;f++){
            winOCounter=0;
            for (int c=0; c< matriz[0].length; c++){
                if (matriz[f][c] == 'o'){
                    winOCounter++;
                    if (winOCounter == 3) {
                        victoryCondition= true;
                        System.out.println("Jugaor 2, has ganado la partida.");
                    }
                }
            }
        }
        return victoryCondition;
    }
    /**
     * Funcion que recorre la matriz columna a columna para el jugador 1.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoColumnaJ1 (char[][] matriz, boolean victoryCondition){
        int winXCounter;
        for (int c=0; c< matriz[0].length;c++){
            // Recorremos las columnas una por una para saber si hay una linea de 3.
            winXCounter=0;
            for (int f=0; f< matriz.length; f++){
                if (matriz[f][c] == 'x'){
                    winXCounter++;
                    if (winXCounter == 3) {
                        victoryCondition= true;
                        System.out.println("Jugaor 1, has ganado la partida.");
                    }
                }
            }
        }
        return victoryCondition;
    }
    /**
     * Funcion que recorre la matriz columna a columna para el jugador 2.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoColumnaJ2 (char[][] matriz, boolean victoryCondition){
        int winOCounter;
        for (int c=0; c< matriz[0].length;c++){
            winOCounter=0;
            for (int f=0; f< matriz.length; f++){
                if (matriz[f][c] == 'o'){
                    winOCounter++;
                    if (winOCounter == 3) {
                        victoryCondition= true;
                        System.out.println("Jugaor 2, has ganado la partida.");
                    }
                }
            }
        }
        return victoryCondition;
    }
    /**
     * Función que recorre la diagonal principal para el jugador 1.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoDiagonalPrincipalJ1 (char[][] matriz, boolean victoryCondition){
        int winXCounter=0;
        for (int p=0; p< matriz.length; p++){
            if ( matriz[p][p]=='x'){
                winXCounter++;
                if (winXCounter == 3) {
                    victoryCondition= true;
                    System.out.println("Jugaor 1, has ganado la partida.");
                }
            }
        }
        return victoryCondition;
    }
    /**
     * Funcion que recorre la diagonal principal para el jugador 2.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoDiagonalPrincipalJ2 (char[][] matriz, boolean victoryCondition){
        int winOCounter=0;
        for (int p=0; p< matriz.length; p++){
            if ( matriz[p][p]=='o'){
                winOCounter++;
                if (winOCounter == 3) {
                    victoryCondition= true;
                    System.out.println("Jugaor 2, has ganado la partida.");
                }
            }
        }
        return victoryCondition;
    }
    /**
     * Función que recorre la diagonal secundaria para el jugador 1.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoDiagonalSecundariaJ1 (char[][] matriz, boolean victoryCondition) {
        int dwinXCounter=0;
        int c = matriz[0].length-1;
        for (int p=0; p< matriz.length; p++){
            if ( matriz[p][c]=='x'){
                dwinXCounter++;
                if (dwinXCounter == 3) {
                    victoryCondition= true;
                    System.out.println("Jugaor 1, has ganado la partida.");
                }
            }
            c--;
        }
        return  victoryCondition;
    }
    /**
     * Función que recorre la diagonal secundaria para el jugador 2.
     * @param matriz array a recorrer.
     * @param victoryCondition condición que para el bucle.
     * @return - Devuelve la condición que permite que el jeugo se siga ejecutando.
     */
    public static boolean recorridoDiagonalSecundariaJ2 (char[][] matriz, boolean victoryCondition){
        int dwinOCounter=0;
        int c = matriz[0].length-1;
        for (int p=0; p< matriz.length; p++){
            if ( matriz[p][c]=='o'){
                dwinOCounter++;
                if (dwinOCounter == 3) {
                    victoryCondition= true;
                    System.out.println("Jugaor 2, has ganado la partida.");
                }
            }
            c--;
        }
        return victoryCondition;
    }
}
