import java.util.Scanner;

public class Ejercicio9_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Escribe un numero:");
        number=sc.nextInt();
        System.out.println("El número " + number + " tiene " + Integer.toString(number).length() + " dígitos");
    }
}
