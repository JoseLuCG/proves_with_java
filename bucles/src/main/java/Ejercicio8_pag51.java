import java.util.Scanner;

public class Ejercicio8_pag51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;

        System.out.println("Escribe un numero:");
        number= sc.nextInt();
        for (int i = 1; i<=10 ; i++){
            System.out.println(number*i);
        }
    }
}
