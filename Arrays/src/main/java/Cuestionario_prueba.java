import java.util.Arrays;
import java.util.Scanner;

public class Cuestionario_prueba {
    public static void main(String[] args) {
        //---------- Variables: ----------
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int number, counter, counter2=0;
        int[] primes = new int[10];
        //---------- Collect the numbers: ----------
        System.out.println("Escribe 10 numeros");
        for (int idx=0; idx<numbers.length; idx++){
            number = sc.nextInt();
            numbers[idx] = number;
        }
        //---------- Show the array: ----------
        System.out.println(Arrays.toString(numbers));
        for (int idx=0; idx<numbers.length; idx++){
            System.out.print(" Idx"+idx+"="+numbers[idx]+" ");
        }

        //---------- Check if the number is prime: ----------
        for (int idx=0; idx< numbers.length; idx++) {
            counter=0;
            //---------- Prove if the number of the array is prime:
            for (int num=2; num <= numbers[idx]/2; num++){
                if ( numbers[idx]%num == 0 ){
                    counter++;
                }
            }
            if (counter==0) {
                primes[counter2] = numbers[idx];
                numbers[idx]=0;
                counter2++;
            }
        }
        for (int num=0; num<10; num++){
            if (numbers[num]!=0){
                primes[counter2]=numbers[num];
                counter2++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(primes));
    }
}
