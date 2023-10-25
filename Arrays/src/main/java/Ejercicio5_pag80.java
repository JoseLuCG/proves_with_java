import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5_pag80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int max= Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        String minIn = "Min", maxIn= "Max";

        System.out.println("Escribe 10 numeros");
        for (int num = 0; num<10; num++){
            numbers[num]= sc.nextInt();
        }
        for (int idx=0; idx<10; idx++){
            if (numbers[idx]<min){
                min = numbers[idx];
            }
            if (numbers[idx]>max) {
                max = numbers[idx];
            }
        }
        for (int idx=0; idx<10; idx++){
            if (numbers[idx] == max){
                System.out.println(numbers[idx]+" Maximo");
            } else if (numbers[idx] == min) {
                System.out.println(numbers[idx]+ " Minimo");
            } else {
                System.out.println(numbers[idx]);
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("El numero maximo es: "+max);
        System.out.println("El numero minimo es: "+min);

    }
}
