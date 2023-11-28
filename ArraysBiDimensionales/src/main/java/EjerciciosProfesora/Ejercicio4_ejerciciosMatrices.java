package EjerciciosProfesora;

import java.util.Random;

public class Ejercicio4_ejerciciosMatrices {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matriz = new int[8][10];
        int max = 0;
        int min = 0, col=0;
        // Rellenamos la matriz con numeros:
        for (int f=0; f< matriz.length; f++){
            for (int c=0; c<matriz[0].length; c++){
                matriz[f][c] = rnd.nextInt(1, 101);
                System.out.printf("%4d",matriz[f][c]);
            }
            System.out.println();
        }

        // Comprobamos el menor elemento de la fila:
        for (int f=0; f<matriz.length; f++){
            min= Integer.MAX_VALUE;
            for (int c=0; c<matriz[0].length; c++){
                if (matriz[f][c]<min){
                    min = matriz[f][c];
                    col = c;
                }
            }
            max = Integer.MIN_VALUE;
            for (int r=0; r<matriz.length; r++){
                if (matriz[r][col] > max){
                    max = matriz[r][col];
                }
            }
            if (min == max) {
                System.out.println("Encontramos el punto de silla en la posicion ("+(f+1)+","+(col+1)+"),"+matriz[f][col]);
            }
        }
    }
}
