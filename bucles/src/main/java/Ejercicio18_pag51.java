import java.util.Scanner;

public class Ejercicio18_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int firstNumber, secondNumber;


        do {
            System.out.println("Escribe un numero.");
            firstNumber = sc.nextInt();
            System.out.println("Escribe el segundo numero.");
            secondNumber = sc.nextInt();

            if (firstNumber == secondNumber){
                System.out.println("los numeros son iguales. Deben ser distintos.");
            }

        } while (firstNumber == secondNumber);

        if (secondNumber<firstNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = firstNumber; i<secondNumber; i+=7){
            System.out.print(i + " ");
        }
    }
}
