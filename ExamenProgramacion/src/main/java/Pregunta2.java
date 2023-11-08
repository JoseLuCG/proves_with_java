import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resto, numeroOriginal;
        long sumatorio=0;

        System.out.println("Dame un numero, comprobaremos si es Armstrong");
        num= sc.nextInt();
        numeroOriginal=num;

        while (num>0){
            resto=num%10;
            num= num/10;
            sumatorio += Math.pow(resto,3);
        }
        if (sumatorio == numeroOriginal) System.out.println("El numero es Armstrong");
        else System.out.println("El nunero NO es Armstrong");

    }
}
