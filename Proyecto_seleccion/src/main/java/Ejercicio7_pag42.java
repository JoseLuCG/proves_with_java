import java.util.Scanner;

public class Ejercicio7_pag42 {
    public static double average(double num1, double num2, double num3){
        double result;
        result = (num1+num2+num3)/3;
        return result;
    }
    public static void main(String[] args) {
        double num1, num2, num3;

        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe la primera nota:");
        num1= sc.nextDouble();
        System.out.println("Escribe la segunda nota:");
        num2= sc.nextDouble();
        System.out.println("Escribe la tercera nota:");
        num3= sc.nextDouble();
        double note = average(num1,num2,num3);

        System.out.println("La media es: "+note);

        if (note<5){
            System.out.println("Tienes un insuficiete");
        } else if (note>=5 && note<6) {
            System.out.println("Tienes un suficiente");
        } else if (note>6 && note<7) {
            System.out.println("Tienes un bien");
        } else if (note>7 && note<=8) {
            System.out.println("Tienes un notable");
        } else if (note>8) {
            System.out.println("tienes un sobresaliente");
        }
    }
}
