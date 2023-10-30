import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6_pag80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[15];
        int temp;

        System.out.println("Escribe 15 numeros:");
        for (int idx=0; idx<15; idx++){
            numbers[idx]= sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        temp = numbers[14];
        for (int idx=14; idx>0; idx--){
            numbers[idx] = numbers[idx-1];
        }
        numbers[0]=temp;
        System.out.println(Arrays.toString(numbers));
    }
}
