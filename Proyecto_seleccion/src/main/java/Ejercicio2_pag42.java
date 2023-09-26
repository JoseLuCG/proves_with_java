import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Ejercicio2_pag42 {
    public static void main(String[] args) {
        String greeting_day = "buenos dias";
        String greeting_aftermoon = "buenas tardes";
        String greeting_night = "buenas noches";
        int hora;
        Scanner sc= new Scanner(System.in);

        System.out.println("introduce una hora entre 0 y 23");
        hora=sc.nextInt();

        if ((hora>=6)&&(hora<=12)){
            System.out.println(greeting_day);
        } else if (hora>=13 && hora<=20) {
            System.out.println(greeting_aftermoon);
        } else if ( (hora>21 && hora<24) || (hora>=0 && hora<6 ) ) {
            System.out.println(greeting_night);
        }
    }
}
