import java.util.Scanner;

public class Ejercicio8_pag85 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] tablero = new int[8][8];
        String position;

        // Solicitamos la posición del arfil:
        System.out.println("Introduce la posicicion del arfil:");
        position = sc.next().toLowerCase();
        char col = position.charAt(0);
        char fil = position.charAt(1);

        //Parseo los datos del usuario a datos validos para la matriz.
        int c = (int)col-97;
        int f = 8 - ((int)fil-49);

        for ()

    }
}
