import java.util.Random;
import java.util.Scanner;

public class Ejercicio6_pag65 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numRandom = random.nextInt(0, 101);
        int numUser, attempts=5;

        while (attempts>0){
            //Request the number from the user.
            System.out.println("Introduce un numero:");
            numUser= sc.nextInt();
            // Analyze the user number.
            if (numUser > numRandom){
                System.out.println("El numero introducido es mayor que el numero a adivinar");
            } else if (numUser < numRandom) {
                System.out.println("El numero introduccido es menor que el numero a adivinar");
            } else {
                System.out.println("Correcto, el numero era: "+numRandom);
            }

            attempts--;
            System.out.println("Te quedan "+attempts+" intentos");
        }
    }
}
