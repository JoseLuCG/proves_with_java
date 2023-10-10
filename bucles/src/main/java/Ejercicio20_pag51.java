import java.util.Scanner;

public class Ejercicio20_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        char character;


        System.out.println("Escribe un caracter:");
        character = sc.nextLine().charAt(0);
        System.out.println("Cuantas filas va a tener la piramide?");
        rows = sc.nextInt();

        // This loop manage the height of the pyramid.
        for ( int height=1; height<=rows; height++){
            //This loop print the white spaces.
            for (int spaces=1; spaces<=rows-height; spaces++){
                System.out.print(" ");
            }

            //This loop print the character.
            for (int charac = 1; charac<=(height*2)-1; charac++ ){
                if ( charac == 2 || charac == (height*2)-2 || height == rows) {
                    System.out.print(character);
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
