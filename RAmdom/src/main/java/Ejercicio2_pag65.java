import java.util.Random;

public class Ejercicio2_pag65 {
    public static void main(String[] args) {
        Random random1 = new  Random();
        Random random2 = new  Random();
        int suit=random1.nextInt(1,5);
        int card=random1.nextInt(1,14);

        switch (suit){
            case 1: System.out.print("Picas, "); break;
            case 2: System.out.print("Diamantes, "); break;
            case 3: System.out.print("Corazones, "); break;
            case 4: System.out.print("Treboles, "); break;
        }
        switch (card){
            case 1: System.out.print(" As"); break;
            case 2: System.out.print(" 2"); break;
            case 3: System.out.print(" 3"); break;
            case 4: System.out.print(" 4"); break;
            case 5: System.out.print(" 5"); break;
            case 6: System.out.print(" 6"); break;
            case 7: System.out.print(" 7"); break;
            case 8: System.out.print(" 8"); break;
            case 9: System.out.print(" 9"); break;
            case 10: System.out.print(" 10"); break;
            case 11: System.out.print(" J"); break;
            case 12: System.out.print(" Q"); break;
            case 13: System.out.print(" K"); break;
        }

    }
}
