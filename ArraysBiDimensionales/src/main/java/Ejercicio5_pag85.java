import java.util.Random;

public class Ejercicio5_pag85 {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom;
        int[][] numbers = new int[6][10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minF=0, minC=0, maxF=0, maxC=0;

        for (int f=0; f< numbers.length; f++){
            for (int c=0; c<numbers.length; c++){
                numRandom = random.nextInt(0, 1001);
                numbers[f][c] = numRandom;
                System.out.printf("%5d",numbers[f][c]);
                if (numbers[f][c]>max){
                    max= numbers[f][c];
                    maxF=f;
                    maxC=c;
                }
                if (numbers[f][c]<min){
                    min=numbers[f][c];
                    minF=f;
                    minC=c;
                }
            }
            System.out.println();
        }
        System.out.println("El numero mayor es "+max+" esta en la fila: "+(maxF+1)+", columna: "+(maxC+1));
        System.out.println("El numero menor es "+min+" esta en la fila: "+(minF+1)+", columna: "+(minC+1));
    }
}
