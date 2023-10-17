import java.util.Scanner;

public class Ejercicio27_pag54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUser;

        System.out.println("Escribe un numero");
        numUser = sc.nextInt();

        for (int i=1; i<numUser; i++){
            if (i%3==0 || i ==1) {
                System.out.println(i);
            }
        }
    }
}
