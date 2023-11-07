import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_pag85 {
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException{
        //Ejercisio extra: colocar las sumas en arrays individuales.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numRandom;
        int[][] numbers = new int[4][5];
        int sumaFilas=0, sumaColumnas=0, sumaTotal=0;

        // Cooca los numeros en el array
        for (int f=0; f<4; f++){
            for (int c=0; c<5; c++){
                numRandom = random.nextInt(100,1000);
                numbers[f][c] = numRandom;
            }
        }

        //Muestra el Array

        for (int f= 0; f<4; f++){
            sumaFilas=0;
            for (int c=0; c<5; c++){
                Thread.sleep(1000);
                System.out.printf(CYAN+"%8d",numbers[f][c]);
                sumaFilas+=numbers[f][c];
            }
            Thread.sleep(1000);
            System.out.printf(GREEN+"%8d\n",sumaFilas);
        }
        for (int c=0; c<5; c++){
            sumaColumnas=0;
            for (int f = 0; f<4; f++){
                sumaTotal += numbers[f][c];
                sumaColumnas += numbers[f][c];
            }
            Thread.sleep(1000);
            System.out.printf(RED+"%8d", sumaColumnas);
        }
        Thread.sleep(1000);
        System.out.printf(BLUE+"%8d",sumaTotal);
    }
}
