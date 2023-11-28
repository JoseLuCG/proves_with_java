package EjerciciosProfesora;

import java.util.Random;

public class Ejercicio2_ejerciciosMatrices {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matriz = new int[4][4];
        /*
        Creamos una matriz simétrica.
         */
        for (int f=0; f< matriz.length; f++){
            for (int c=0; c< matriz[0].length; c++){
                System.out.printf("%3d",matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // Comprobamos si la matriz es simétrica:
        for (int fd=0; fd< matriz[0].length; fd++){
            for (int cd=0; cd<fd; cd++){
                matriz[fd][cd] = rnd.nextInt(1,10);
            }
        }
        for (int f=0; f< matriz.length; f++){
            for (int c=0; c< matriz[0].length; c++){
                System.out.printf("%3d",matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int fd=0; fd< matriz[0].length; fd++){
            for (int cd=0; cd<fd; cd++){
                matriz[cd][fd]= rnd.nextInt(1,10);
            }
        }
        for (int f=0; f< matriz.length; f++){
            for (int c=0; c< matriz[0].length; c++){
                System.out.printf("%3d",matriz[f][c]);
            }
            System.out.println();
        }
    }
}
