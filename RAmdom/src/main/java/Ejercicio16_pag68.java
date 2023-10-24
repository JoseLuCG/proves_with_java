import java.util.Random;

public class Ejercicio16_pag68 {
    public static void main(String[] args) {
        Random random = new Random();
        int throwGlobal, throw1 =0 , throw2 = 0, throw3 = 0;
        String victory = "Enhorabuena, ha ganado 10 monedas";
        String recover = "Bien, ha recuperado su moneda";
        String defeat = "Lo siento, ha perdido";

        for ( int toss = 1; toss<=3; toss ++) {
            throwGlobal = random.nextInt(1,6);
            switch (throwGlobal) {
                case 1:
                    System.out.print(" corazon ");
                    break;
                case 2:
                    System.out.print(" diamante ");
                    break;
                case 3:
                    System.out.print(" herradura ");
                    break;
                case 4:
                    System.out.print(" campana ");
                    break;
                case 5:
                    System.out.print(" limoon ");
                    break;
            }
            if ( toss == 1){
                throw1 = throwGlobal;
            } else if (toss == 2) {
                throw2 = throwGlobal;
            } else if (toss == 3) {
                throw3 = throwGlobal;
            }
        }
        System.out.println();
        if ((throw1 != throw2) && (throw2 != throw3)) {
            System.out.println(defeat);
        } else if (throw1 == throw2 && throw2 == throw3) {
            System.out.println(victory);
        } else  {
            System.out.println(recover);
        }
    }
}
