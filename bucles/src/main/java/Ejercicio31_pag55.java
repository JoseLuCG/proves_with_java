import java.util.Scanner;

public class Ejercicio31_pag55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;

        System.out.println("Escribe la altura:");
        height = sc.nextInt();
        int width= height/2;

        //Loop that count the rows of L.
        for (int rows=0; rows<height; rows++){
            //Loop that print white spaces
            for(int spaces=0; spaces<width; spaces++){
                if (spaces!=1){
                    System.out.print(" ");
                }
            }
            // Loop that prints the *.
            for (int column=0; column<width;column++){
                if (rows == height-1){
                    System.out.print("*  ");
                } else if (column == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}