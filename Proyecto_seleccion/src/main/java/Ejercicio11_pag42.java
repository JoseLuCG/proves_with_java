import java.util.Scanner;

public class Ejercicio11_pag42 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hours, minutes;
        int hourToSeconds, minutesToSeconds, totalSeconds, result;

        System.out.println("Escribe tu hora:");
        hours= sc.nextInt();
        System.out.println("Escribe tus minutos:");
        minutes= sc.nextInt();

            minutesToSeconds = minutes*60;
            hourToSeconds = hours * 3600;
            totalSeconds = hourToSeconds + minutesToSeconds;
            result = 86400 - totalSeconds;

        System.out.println("El tiempo restante para media noche es: "+result);
    }
}
