import java.util.Scanner;

public class Ejercicio12_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.println("¿cuantos terminos quieres ver?");
        n = sc.nextInt();

        for (int i = n; i<10; i++){
           int term1=0;
           int term2=1;
           int term3;
            System.out.println(term3);
           term3 = term1+term2;
           term1=term2;
           term2=term3;
        }
    }
}
