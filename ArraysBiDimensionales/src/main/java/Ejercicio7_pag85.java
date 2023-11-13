import java.util.Random;
import java.util.Scanner;

public class Ejercicio7_pag85 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] juego = new int[5][4];
        int f= rnd.nextInt(0,5);
        int c= rnd.nextInt(0,4);
        int fm, cm;
        /**
         * Tesoro = 2
         * Mina = 1
         */


        //Asignamos el tesoro:
        juego[f][c] = 2;
        //Comprobamos que donde vaya a ir la mina no esté el tesoro.
        do {
            fm = rnd.nextInt(0,5);
            cm = rnd.nextInt(0,5);
        }while (f==fm && c==cm);
        //Agignamos la mina:
        juego[fm][cm] = 1;
        // Vendria el juego
    }
}
