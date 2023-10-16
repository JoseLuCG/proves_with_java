import java.util.Scanner;

public class Ejercicio25_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, counter=0, r;
        int inv=0;

        System.out.println("Escribe un número:");
        number =sc.nextInt();

        while ( number!=0 ){
            counter++;
            r=  number%10;
            number=number/10;
            inv=inv*10+r;

        }
        System.out.println("El numero resultante es: "+ inv);
    }
}
