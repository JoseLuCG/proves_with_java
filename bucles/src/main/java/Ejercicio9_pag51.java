import java.util.Scanner;

public class Ejercicio9_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, counter= 0;
        System.out.println("Escribe un numero:");
        number=sc.nextInt();

        do {

            counter++;
            number = number/10;

        }while (number!=0);
        System.out.println("Tiene "+ counter+" digitos");
    }
}
