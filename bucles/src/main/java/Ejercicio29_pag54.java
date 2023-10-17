import java.util.Scanner;

public class Ejercicio29_pag54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el primer numero");
        num1 = sc.nextInt();
        System.out.println("introduce el segundo numero");
        num2 = sc.nextInt();

        if (num1>=0 && num2>0) {
            for (int i = 1; i <= num1; i++) {
                if (i % num2 != 0) {
                    System.out.println(i);
                }
            }
        }else System.out.println("no es positivo");
    }
}
