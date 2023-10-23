import java.util.Random;

public class Ejercicio9_pag66 {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom;
        int replay = 0;

        do {
            numRandom = random.nextInt(1,101);
            System.out.println(numRandom);
            replay++;
        }while (numRandom!=24);
        System.out.println("He contado "+replay+" numeros");
    }
}
