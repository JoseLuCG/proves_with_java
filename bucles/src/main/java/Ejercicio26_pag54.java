import java.util.Scanner;

public class Ejercicio26_pag54 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number, digit, rest;

        System.out.println("Dime un numero:");
        number = sc.nextInt();
        String numString = number+"";
        System.out.println("Dime un digito de ese numero");
        digit=sc.nextInt();
        int numLength = (number+"").length();

        do{
            rest = number%10;
            number=number/10;

            if (rest == digit){
                System.out.println("La posicion es "+numLength);
            }
        }while (number!=0);
    }
}
