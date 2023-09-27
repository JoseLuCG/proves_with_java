import java.util.Scanner;

public class Ejercicio9_pag42 {
    public static double[] equSolution(double a, double b, double c){
        double x1;
        double x2;
        double rad1 = Math.sqrt(b*b-4*a*c);
        double rad2 = -(Math.sqrt(b*b-4*a*c));
        double [] results = {};
        x1 = (-b*rad1)/(2*a);
        x2 = (-b*rad2)/(2*a);
        results[0] = x1;
        results[1] = x2;
        return results;
    }
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe el primer coeficiente:");
        a=sc.nextDouble();
        System.out.println("Escribe el primer coeficiente:");
        b= sc.nextDouble();
        System.out.println("Escribe el primer coeficiente:");
        c= sc.nextDouble();


    }
}
