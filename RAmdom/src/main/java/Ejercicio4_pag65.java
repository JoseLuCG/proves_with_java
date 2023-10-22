import java.util.Random;

public class Ejercicio4_pag65 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        for (int counter=0; counter<10; counter++){
            number = random.nextInt(0,11);
            System.out.print(number+" ");
        }
    }
}
