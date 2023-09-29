import java.util.Scanner;

public class Ejercicio9_pag42 {
    public static double[] equSolution(double a, double b, double c){
        double x1;
        double x2;
        double rad = Math.sqrt(b*b-4*a*c);
        double [] results = {0,0};
        x1 = (-b+rad)/(2*a);
        x2 = (-b-rad)/(2*a);
        results[0] = x1;
        results[1] = x2;
        return results;
    }
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double [] totalResult;
        double result1;
        double result2;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe el primer coeficiente:");
        a=sc.nextDouble();
        System.out.println("Escribe el segundo coeficiente:");
        b= sc.nextDouble();
        System.out.println("Escribe la constante coeficiente:");
        c= sc.nextDouble();

        totalResult = equSolution(a,b,c);
        result1 = totalResult[0];
        result2 = totalResult[1];

        System.out.println("El resultado de x1 es: "+ result1);
        System.out.println("El resultado de x2 es: "+ result2);

    }
}
