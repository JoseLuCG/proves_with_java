package EjerciciosProfesora;

import java.util.Scanner;

public class Ejercicio7_ejerciciosMatrices {
    public static boolean isMagic(int[][] matrix){
        boolean squareMagic= false;
        int[] sumRows = new int[3];
        int[] sumColumns = new int[3];
        int rowAmount = 0, colAmount=0, sumAmount=0;

        for (int f=0; f< matrix.length; f++){
            rowAmount=0;
            for (int c=0;c< matrix[0].length; c++){
                rowAmount = rowAmount + matrix[f][c];
                sumRows[f] = rowAmount;
            }
        }
        for (int c = 0; c < matrix[0].length; c++) {
            colAmount=0;
            for (int f = 0; f < matrix.length; f++) {
                colAmount = colAmount + matrix[f][c];
                sumColumns[c] = colAmount;
            }
        }

        for (int i = 0; i < sumRows.length; i++) {
            if (sumRows[i] == sumColumns[i]) {
                sumAmount++;
            }
        }
        if (sumAmount==3) squareMagic= true;

        return squareMagic;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int f, c, numbers =1;

        do {
            System.out.println("Escribe en que posicion colocamos el numero:");
            f = sc.nextInt();
            c = sc.nextInt();

            matriz[f][c]= numbers;
            numbers++;

        }while (numbers<=9);

        //Mostramos el cuadrado:
        for (int fs = 0; fs < matriz.length; fs++) {
            for (int cs = 0; cs < matriz[0].length; cs++) {
                System.out.printf("%2d",matriz[fs][cs]);
            }
            System.out.println();

        }
        if (isMagic(matriz)) {
            System.out.println("El cuadrado es magico");
        } else System.out.println("El cuadrado no es magico");
    }
}
