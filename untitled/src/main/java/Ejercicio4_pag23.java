import java.util.Scanner;

public class Ejercicio4_pag23 {
    public static void main(String[] args) {
        //Conversor de Euros a Peseas.
        double euros;
        double pesetas;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe una cantidad de euros");
        euros=sc.nextInt();
        pesetas = euros * 166.386;
        System.out.println("La cantidad es: "+pesetas);

    }
}
