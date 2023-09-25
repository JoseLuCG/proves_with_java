import java.util.Scanner;

public class Ejercicio5_pag23 {
    public static void main(String[] args) {
        //Conversor de Pesetas a Euros.
        double euros;
        double pesetas;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe una cantidad de pesetas");
        pesetas=sc.nextDouble();
        euros = pesetas / 166.386;
        System.out.println("La cantidad es: "+euros);

    }
}
