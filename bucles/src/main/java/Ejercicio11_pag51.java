import java.util.Scanner;

public class Ejercicio11_pag51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;

        System.out.println("Escribe tu numero: ");
        number= sc.nextInt();

        for (int i = 0; i<5; i++){
            System.out.println((number+i)+"     "+((number+i)*(number+i))+"     "+((number+i)*(number+i)*(number+i)));
        }
    }
}
