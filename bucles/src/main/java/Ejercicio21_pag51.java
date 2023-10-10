import java.util.Scanner;

public class Ejercicio21_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numbers = 0, odd, even, oddAcum = 0, oddAverage = 0, counter = 1,maxEven=0;

        do {
            System.out.println("Escribe un numero.");
            num=sc.nextInt();
            if (num>0) {
                // Count the numbers entered:
                numbers++;

                // Separate the evens from the odds:
                if (num % 2 == 0) {
                    even = num;
                    if (even > maxEven) maxEven = even;

                } else {
                    odd = num;
                    oddAcum = oddAcum + odd;
                    oddAverage = oddAcum / counter;
                    counter++;
                }
            }else System.out.println("Numero negativo introducido. Fin del proceso.");

        }while (num>0);
        System.out.println("Se han introducido "+numbers+" numeros");
        System.out.println("La media de los impares introducidos es: "+oddAverage);
        System.out.println("El mayor de los numeros pares es: "+maxEven);
    }
}
