import java.util.Random;
import java.util.Scanner;

public class Ejercicio7_pag85 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] juego = new int[5][4];
        int f= rnd.nextInt(0,5);
        int c= rnd.nextInt(0,4);
        int fm, cm, cont=0;
        /*
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
        do {

            do {
                System.out.println("Introduce las coordenadas donde crees que esta el tesoro. Entre 1-5 y de 1-4");
                f = sc.nextInt();
                c = sc.nextInt();
            }while (f>5 ||c>4);
            f--; c--; cont++;
            // Ver colindantes a la mina:
            int fr = Math.abs(fm-f);
            int cr = Math.abs(cm-c);
            if ( (fr==1 && cr==1) || (fr==0 && cr==1) ||(fr==1 && cr==0)) {
                System.out.println("Tienes una mina cerca");
            }

            if (( juego[f][c] != 1 || juego[f][c] != 2 )) System.out.println("Te quedan "+(3-cont)+" intentos");
        }while ( ( juego[f][c] != 1 || juego[f][c] != 2 ) && cont<3 );

        if (juego[f][c]==2) System.out.println("Enorabuena has encontrado el tesoro.");
        if (juego[f][c]==1) System.out.println("Lo siento, te ha explotado la mina.");
        if (cont == 3) System.out.println("Se acabaron los intentos.");

        for (int i = 0; i < juego.length; i++) {
            for (int j = 0; j < juego[0].length; j++) {
                System.out.printf("%4d", juego[i][j]);
            }
            System.out.println();
        }
    }
}
