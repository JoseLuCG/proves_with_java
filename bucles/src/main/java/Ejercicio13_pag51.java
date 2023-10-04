import java.util.Scanner;

public class Ejercicio13_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int positiveNumbrersCounter = 0, negativeNumbersCounter = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("dime un numero:");
            number = sc.nextInt();
            if (number>0){
                positiveNumbrersCounter++;
            } else negativeNumbersCounter++;
        }
        System.out.println("Hay " + positiveNumbrersCounter + " numeros positivos.");
        System.out.println("Hay " + negativeNumbersCounter + " numeros negativos. ");
    }
}
