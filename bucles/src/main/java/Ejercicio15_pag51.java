import java.util.Scanner;

public class Ejercicio15_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base, exponent;

        System.out.println("Escribe un numero real como base:");
        base = sc.nextInt();
        System.out.println("Escribe el exponente:");
        exponent= sc.nextInt();

        for (int i=1;i<=exponent; i++) {
            System.out.println(base+"^"+i);
        }
    }
}
