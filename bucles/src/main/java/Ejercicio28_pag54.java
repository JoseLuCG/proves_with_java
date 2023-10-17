import java.util.Scanner;

public class Ejercicio28_pag54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numUser;
        float factorial=1;

        do {
            System.out.println("Escribe un numero");
            numUser = sc.nextInt();
        }while (numUser<0);

        for (int i=1; i<=numUser;i++){
            factorial=factorial*i;
        }
        System.out.println("El factorial es: "+factorial);
    }
}
