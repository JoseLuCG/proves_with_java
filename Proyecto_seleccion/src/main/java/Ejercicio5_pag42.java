import java.util.Scanner;

public class Ejercicio5_pag42 {
    public static int equationSolution(int a, int b) {
        int x;
        x= -(b/a);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int coefficient; //a
        int constant; //b

        System.out.println("Escribe el coeficiente:");
        coefficient = sc.nextInt();
        System.out.println("Escribe la constante");
        constant=sc.nextInt();
        if (coefficient!=0) {
            System.out.println("La solucion es: " + equationSolution(coefficient, constant));
        } else {
            System.out.println("No tiene solucion");
        }
    }
}
