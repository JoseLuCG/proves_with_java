import java.util.Scanner;

public class Ejercicio16_pag51 {
    public static boolean primoResult (int number){
        boolean result = true;

        for (int i=2; i<number; i++){
            if (number%i == 0) {
                result = false;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Escribe un numero");
        number= sc.nextInt();
        boolean primo = primoResult(number);

        /*
        Solo es divisible entre el mismo y la unidad.
         */
        if ( primo && number%number==0 && number%1==0 ){
            System.out.println("el numero es primo");
        } else {
            System.out.println("el numero no es primo");
        }
    }
}
