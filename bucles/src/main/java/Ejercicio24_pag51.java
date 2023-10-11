import java.util.Scanner;

public class Ejercicio24_pag51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 1;
        int userHeight;

        System.out.println("Introduce una altura:");
        userHeight= sc.nextInt();

        int spaces= userHeight-1;

        while (height<=userHeight){

            //Loop that prints spaces:
            for (int spacePrint=1; spacePrint<=spaces; spacePrint++){
                System.out.print(" ");
            }

            //Loop that print the numbres line:
            for (int numPrint=1; numPrint<height;numPrint++){
                System.out.print(numPrint);
            }

            //Loop that reverse the numbers.
            for ( int numReverse = height; numReverse>0; numReverse--){
                System.out.print(numReverse);
            }
            System.out.println();
            height++;
            spaces--;
        }
    }
}
