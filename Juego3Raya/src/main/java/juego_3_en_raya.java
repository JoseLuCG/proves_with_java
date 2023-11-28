import java.util.Scanner;
import static biblioteca.funciones.*;

public class juego_3_en_raya {

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
                        System.out.printf("%4s","_");
                    }else System.out.printf("%4s",board[f][c]);
                }
                System.out.println();
                System.out.println();
            }
            //---------- Condiciones de victoria. ----------

            //---------- Recorrido de filas ----------
            finish=recorridoLineaJ1(board, finish);
            //----- Recorrido linea a linea para jugador 2: -----
            finish=recorridooLineaJ2(board, finish);

            //---------- Recorrido de columnas: ----------
            //----- Recorrido en columnas para el jugador 1
            finish=recorridoColumnaJ1(board, finish);
            //----- Recorrido en columnas para el jugador 2
            finish=recorridoColumnaJ2(board, finish);


            //---------- Recorrido diagonal ----------
            //----- Recorrido en diagonal principal para el jugador 1
            finish=recorridoDiagonalPrincipalJ1(board, finish);
            //----- Recorrido en diagonal principal para el jugador 2
            finish=recorridoDiagonalPrincipalJ2(board, finish);

            //----- Recorrido en diagonal secundaria para el jugador 1
            finish=recorridoDiagonalSecundariaJ1(board, finish);
            //----- Recorrido en diagonal secundaria para el jugador 2
            finish=recorridoDiagonalSecundariaJ2(board, finish);

            //---------- Cambiamos turno. ----------
            playerCount++;
        }while (!finish);
    }
}
