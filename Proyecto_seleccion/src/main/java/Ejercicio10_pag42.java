import java.util.Scanner;

public class Ejercicio10_pag42 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int day, month;
        /*
        20/01 a 18/02: Acuario x
        19/02 a 20/03: Piscis x
        21/03 a 19/04: Aries x
        20/04 a 20/05: Tauro x
        21/05 a 20/06: Geminis x
        21/06 a 22/07: Cancer x
        23/07 a 22/08: Leo x
        23/08 a 23/09: Virgo x
        24/09 a 22/10: Libra x
        23/10 a 21/11: Scorpio x
        22/11 a 21/12: Sagitario x
        22/12 a 19/01: Capricornio x
         */
        System.out.println("Escribe tu dia de nacimiento");
        day=sc.nextInt();
        System.out.println("Escribe tu mes de nacimiento");
        month= sc.nextInt();


            if ( ( day >= 20 && day <= 31 )&&( month == 1 ) || ( day >= 1 && day <= 18 )&&( month== 2 ) ){
                System.out.println("Eres acuario.");
            } else if ( ( day >= 19 && day <= 31 )&&( month == 2 ) || ( day >= 1 && day <= 20 )&&( month== 3 ) ) {
                System.out.println("Eres Piscis.");
            } else if ( ( day >= 21 && day <= 31 )&&( month == 3 ) || ( day >= 1 && day <= 19 )&&( month== 4 ) ) {
                System.out.println("Eres Aries.");
            } else if ( ( day >= 20 && day <= 31 )&&( month == 4 ) || ( day >= 1 && day <= 20 )&&( month== 5 ) ) {
                System.out.println("Eres Tauro.");
            } else if ( ( day >= 21 && day <= 31 )&&( month == 5 ) || ( day >= 1 && day <= 20 )&&( month== 6 ) ) {
                System.out.println("Eres Geminis.");
            } else if ( ( day >= 21 && day <= 31 )&&( month == 6 ) || ( day >= 1 && day <= 22 )&&( month== 7 ) ) {
                System.out.println("Eres Cancer.");
            } else if ( ( day >= 23 && day <= 31 )&&( month == 7 ) || ( day >= 1 && day <= 22 )&&( month== 8 ) ) {
                System.out.println("Eres Leo.");
            } else if ( ( day >= 23 && day <= 31 )&&( month == 8 ) || ( day >= 1 && day <= 23 )&&( month== 9 ) ) {
                System.out.println("Eres Virgo.");
            } else if ( ( day >= 24 && day <= 31 )&&( month == 9 ) || ( day >= 1 && day <= 22 )&&( month== 10 ) ) {
                System.out.println("Eres Libra.");
            } else if (  ( day >= 23 && day <= 31 )&&( month == 10 ) || ( day >= 1 && day <= 21 )&&( month== 11 ) ) {
                System.out.println("Eres Scorpio");
            } else if ( ( day >= 22 && day <= 31 )&&( month == 11 ) || ( day >= 1 && day <= 21 )&&( month== 12 ) ) {
                System.out.println("Eres Sagitario.");
            } else if ( ( day >= 22 && day <= 31 )&&( month == 12 ) || ( day >= 1 && day <= 19 )&&( month== 1 ) ) {
                System.out.println("Eres Capricornio.");
            } else {
                System.out.println("La fecha no es correcta");
            }
    }
}
