import java.util.Scanner;

public class Ejercicio8_pag42 {
    public static double average(int num1, int num2, int num3){
        double result;
        result = (num1+num2+num3)/3;
        return result;
    }
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe la primera nota:");
        num1= sc.nextInt();
        System.out.println("Escribe la segunda nota:");
        num2= sc.nextInt();
        System.out.println("Escribe la tercera nota:");
        num3= sc.nextInt();

        System.out.println("La media es: "+average(num1,num2,num3));
    }
}
