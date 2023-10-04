import java.util.Scanner;

public class Ejercicio12_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int term1 = 0, term2 = 1, sum=1;

        System.out.println("¿cuantos terminos quieres ver?");
        n = sc.nextInt();
        System.out.println(term1);

        for (int i = 0; i<n; i++){
            System.out.println(sum);
            sum = term1 + term2;
            term1= term2;
            term2= sum;

        }
    }
}
