import java.util.Arrays;
import java.util.Random;

public class Ejercicio4_pag79 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        Random random = new Random();
        int numRandom;

        for (int num = 0; num<20; num++){
            numRandom = random.nextInt(1, 101);
            numero[num] = numRandom;
            cuadrado[num] = numero[num] * numero[num];
            cubo[num] = cuadrado[num] * numero[num];
        }

        System.out.println("numero | cuadrado |  cubo");
        for (int i = 0; i<20; i++) {
            System.out.printf("%4d   |  %5d   |   %6d\n", numero[i],cuadrado[i],cubo[i]);
        }
    }
}
