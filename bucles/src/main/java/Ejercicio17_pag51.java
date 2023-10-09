import java.util.Scanner;

public class Ejercicio17_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int suma=0;

        do {
            System.out.println("Escribe un numero:");
            number = sc.nextInt();
        } while (number<0);

        for (int i = number; i< number + 100;i++){
            suma +=i;
            System.out.println( number+"+"+suma+"="+(number+suma) );
        }
    }
}
