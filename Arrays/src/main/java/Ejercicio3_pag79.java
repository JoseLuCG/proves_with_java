import java.util.Scanner;

public class Ejercicio3_pag79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Escribe 10 numeros:");
        for (int num = 0; num < 10; num++) {
            numbers[num]= sc.nextInt();
        }
        for (int num = numbers.length -1; num >=0; num--){
            System.out.print(" "+numbers[num]+" ");
        }
    }
}
