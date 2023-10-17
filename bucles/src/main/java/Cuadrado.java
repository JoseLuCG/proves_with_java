import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int height, width;

        System.out.println("Escribe la altura de la figura:");
        height = sc.nextInt();
        System.out.println("Escribe la base");
        width = sc.nextInt();
        System.out.println("Dime un simbolo");
        String p = sc.next();

        for (int row=0; row<height; row++){
            // Loop that print the character:
            for (int column = 0; column<width; column++){
                if (row == 0 || row == height - 1){
                    System.out.print(p+" ");
                } else if ( column == 0 || column == width -1) {
                    System.out.print(p+" ");
                }else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
