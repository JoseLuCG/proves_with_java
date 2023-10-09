import java.util.Scanner;

public class Ejercicio14_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponent;
        System.out.println("Dime la base.");
        base = sc.nextInt()
        System.out.println("Dime la potencia");
        exponent = sc.nextInt();

        for (int i=0; i< exponent; i++) {
            base*base;
        }
    }
}
