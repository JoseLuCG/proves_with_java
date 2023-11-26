import java.util.Scanner;

public class juego_3_en_raya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int rowPosition, columnPosition;
        boolean finish = false;
        int playerCount=1, winCounter=0;
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
            System.out.println(player+"Indica la posicion de ls fila:");
            rowPosition = sc.nextInt();
            System.out.println(player+"Indica la posicion de la coolumna");
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
            for (int f=0; f< board.length;f++){

                for (int c=0; c< board[0].length; c++){
                    if (board[f][c] == 'x'){
                        winCounter++;
                    }
                }
            }
            //---------- Cambiamos turno. ----------
            playerCount++;

        }while (finish== false);
    }
}
