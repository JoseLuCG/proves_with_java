import java.util.Scanner;

public class Ejercicio7_pag51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inputUser;
        int password = 1234;
        int attempts = 4;


        do {
            System.out.println("Escribe la contrasena:");
            inputUser=sc.nextInt();

            if (password==inputUser) {
                System.out.println("la contrasena es correcta");
            }else System.out.println("la contrasena es incorrecta");

            if (attempts==0) System.out.println("no te quedan intentos");
            attempts--;
        } while (inputUser != password && attempts!=0);
    }
}
