import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int base;
        int height;
        double result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe la base en centimetros:");
        base=sc.nextInt();
        System.out.println("Escribe la altura en centimetros");
        height= sc.nextInt();
        result=base*height;
        System.out.println("El resultado es: "+result);
    }
}
