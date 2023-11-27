import java.util.Scanner;

public class juego_3_en_raya {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int rowPosition, columnPosition;
        boolean finish = false;
        int playerCount=1, winOCounter=0, dwinOCounter=0;
        String jugagor1 ="Jugador 1. ";
        String jugador2 ="Jugador 2. ";
        String player="Jugador 1. ";
        char playerMark = 'x';
        char marcaJugador1='x';
        char marcaJugador2='o';


        do {
            // ---------- Comprobamos de quien es el turno: ----------
            if (playerCount%2 ==0) {
                player = jugador2;
                playerMark = marcaJugador2;
            } else {
                player = jugagor1;
                playerMark = marcaJugador1;
            }

            // ---------- Preguntamos en que posicion se colocará la ficha. ----------
            System.out.println(player+"Indica la posicion de la fila:");
            rowPosition = sc.nextInt();
            System.out.println(player+"Indica la posicion de la columna");
            columnPosition = sc.nextInt();

            //---------- Asignamos la marca en la posición ----------
            board[rowPosition][columnPosition] = playerMark;

            for (int f=0; f< board.length; f++){
                for (int c=0; c< board[0].length; c++){
                    if (board[f][c]==0){
                        System.out.printf("%2s","_");
                    }else System.out.printf("%2s",board[f][c]);
                }
                System.out.println();
            }
            //---------- Condiciones de victoria. ----------
            //---------- Recorrido de filas ----------
            recorridoLineaJ1(board, finish);
            //----- Recorrido linea a linea para jugador 2: -----
            recorridooLineaJ2(board, finish);
            //---------- Recorrido de columnas: ----------
            //----- Recorrido en columnas para el jugador 1
            recorridoColumnaJ1(board, finish);
            //----- Recorrido en columnas para el jugador 2
            recorridoColumnaJ2(board, finish);
            //---------- Recorrido diagonal ----------
            //----- Recorrido en diagonal principal para el jugador 1
            for (int p=0; p< board.length; p++){
                if ( board[p][p]=='x'){
                    winXCounter++;
                    if (winXCounter == 3) {
                        finish= true;
                        System.out.println("Jugaor 1, has ganado la partida.");
                    }
                }
            }
            //----- Recorrido en diagonal principal para el jugador 2
            for (int p=0; p< board.length; p++){
                if ( board[p][p]=='o'){
                    winOCounter++;
                    if (winOCounter == 3) {
                        finish= true;
                        System.out.println("Jugaor 2, has ganado la partida.");
                    }
                }
            }
            //----- Recorrido en diagonal secundaria para el jugador 1

            //----- Recorrido en diagonal secundaria para el jugador 2
            int c = board[0].length-1;
            for (int p=0; p< board.length; p++){
                if ( board[p][c]=='o'){
                    dwinOCounter++;
                    if (dwinOCounter == 3) {
                        finish= true;
                        System.out.println("Jugaor 2, has ganado la partida.");
                    }
                }
                c--;
            }
            //---------- Cambiamos turno. ----------
            playerCount++;

        }while (!finish);
    }
}
