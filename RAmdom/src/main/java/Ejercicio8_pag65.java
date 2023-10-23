import java.util.Random;

public class Ejercicio8_pag65 {
    public static void main(String[] args) {
        Random random = new Random();
        int betUser;
        int value1 = 1, value2 = 2;
        char value3 = 'x';

        for (int row = 0; row < 15; row++) {
            // loops with the bets.
            for (int bet = 0; bet < 3; bet++) {
                betUser = random.nextInt(1, 7);
                if (betUser >= 1 && betUser <= 3) {
                    System.out.print(value1 + " ");
                } else if (betUser > 3 && betUser <= 5) {
                    System.out.print(value2 + " ");
                } else if (betUser == 6) {
                    System.out.print(value3 + " ");
                }
            }
            System.out.println();
        }
    }
}

