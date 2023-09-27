import java.util.Scanner;

public class Ejercicio6_pag42 {
    public static double solution(double h){
        double g=9.81; //m/s
        double t;
        t=Math.sqrt( (2*h)/g );
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height;

        System.out.println("Escribe la altura:");
        height=sc.nextDouble();
        if (height>0) {
            System.out.println("El tiempo que tarda es " + solution(height));
        } else {
            System.out.println("error");
        }
    }
}
