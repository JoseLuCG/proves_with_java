import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hours, minutes;
        int resHour, resMinutes, hourToSeconds, minutesToSeconds, result;

        System.out.println("Escribe tu hora:");
        hours= sc.nextInt();
        System.out.println("Escribe tus minutos:");
        minutes= sc.nextInt();

            resMinutes = 60 - minutes;
            resHour = 24 - hours;
            hourToSeconds = resHour*3600;
            minutesToSeconds = resMinutes*60;
            result = hourToSeconds + minutesToSeconds;

        System.out.println("El tiempo restante para media noche es: "
                +resHour+" horas"+resMinutes+" minutos");
        System.out.println("faltan "+result+" segundos para media noche.");
    }
}
