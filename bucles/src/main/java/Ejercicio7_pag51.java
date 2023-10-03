import java.util.Scanner;

public class Ejercicio7_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputUser;
        int password = 1234;


        do {
            System.out.println("Escribe la contrasena:");
            inputUser=sc.nextInt();
        } while (inputUser != password);
        System.out.println("la contrasena es correcta");
    }
}
