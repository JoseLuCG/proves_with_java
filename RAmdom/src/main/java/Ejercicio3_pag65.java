import java.util.Random;

public class Ejercicio3_pag65 {
    public static void main(String[] args) {
        Random random1 = new  Random();
        Random random2 = new  Random();
        int suit=random1.nextInt(1,5);
        int card=random1.nextInt(1,14);

        switch (suit){
            case 1: System.out.print("Oros, "); break;
            case 2: System.out.print("Bastos, "); break;
            case 3: System.out.print("Copas, "); break;
            case 4: System.out.print("Espadas, "); break;
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
            case 11: System.out.print(" Sota"); break;
            case 12: System.out.print(" Caballo"); break;
            case 13: System.out.print(" Rey"); break;
        }

    }
}
