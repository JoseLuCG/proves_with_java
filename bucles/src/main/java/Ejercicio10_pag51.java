import java.util.Scanner;

public class Ejercicio10_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number, average;
        int numberAcumulator = 0;
        int counter = 1;
        /*
            Pregunta: ¿Como hacer para que no cuente el ultimo número introduccido?

        */
        do {
                System.out.println("Dame un numero:");
                number = sc.nextInt();
                numberAcumulator = numberAcumulator + number;
                average = numberAcumulator / counter;
                counter++;
        }while (number>0);

        System.out.println("La media es de "+ average);
    }
}
