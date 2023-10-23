import java.util.Random;

public class Ejercicio7_pag65 {
    public static void main(String[] args) {
        Random random = new Random();
        int betUser;
        int value1 = 1, value2 = 2;
        char value3 = 'x';

        for (int row = 0; row<15; row++) {
            // loops with the bets.
            for (int bet = 0; bet<3; bet++){
                betUser = random.nextInt(1,4);
                switch (betUser){
                    case 1: System.out.print(value1+" "); break;
                    case 2:
                        System.out.print(value2+" "); break;
                    case 3:
                        System.out.print(value3+" ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
