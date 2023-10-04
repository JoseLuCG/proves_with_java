import java.util.Scanner;

public class Ejercicio10_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number, average=0;
        int numberAcumulator = 0;
        int counter = 1;

        do {
                System.out.println("Dame un numero:");
                number = sc.nextInt();
                if(number>0) {
                    numberAcumulator = numberAcumulator + number;
                    average = numberAcumulator / counter;
                    counter++;
                }

        }while (number>0);

        System.out.println("La media es de "+ average);
    }
}
