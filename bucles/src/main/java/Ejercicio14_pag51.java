import java.util.Scanner;

public class Ejercicio14_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, exponent, result=1;

        System.out.println("Escribe el numero.");
        number = sc.nextInt();
        System.out.println("Escribe el exponente");
        exponent = sc.nextInt();

        for (int i=0; i<exponent; i++){
            result= result*number;
        }
        System.out.println("El resultado es: "+result);
    }
}
