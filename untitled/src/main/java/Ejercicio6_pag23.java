import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio6_pag23 {
    public static void main(String[] args) {
        //Añadir el IVA a una factura.
        double amount;
        double tax=0.21;
        double result;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe el importe de la factura:");
        amount=sc.nextDouble();
        result= amount+(amount*tax);
        System.out.println("El importe con iva es de "+result+"$");


    }





}
