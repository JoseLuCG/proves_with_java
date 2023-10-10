import java.util.Scanner;

public class Ejercicio23_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sumNumbrs=0, counter=1, average;

        do {
            System.out.println("Escribe un numero para sumar:");
            num = sc.nextInt();

            sumNumbrs = sumNumbrs + num;
            average = sumNumbrs/ counter;
            counter++;


        } while (sumNumbrs < 10000);
        System.out.println("La suma es igual a: "+sumNumbrs);
        System.out.println("Los numeros introducidos son: "+(counter-1));
        System.out.println("La media de los numeros introduccidos es: "+average);
    }
}
