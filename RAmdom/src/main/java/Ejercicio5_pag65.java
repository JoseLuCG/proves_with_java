import java.util.Random;

public class Ejercicio5_pag65 {
    public static void main(String[] args) {
        Random random = new Random();
        int number, maxNumber=0, minNumber=200, average=0, averageAcum=0;

        for (int counter=1; counter<=50; counter++){
            number = random.nextInt(100,200);
            System.out.print(number+" ");
            if (number>maxNumber){
                maxNumber = number;
            }
            if (number<minNumber){
                minNumber=number;
            }
            averageAcum = averageAcum + number;
            average = averageAcum / counter;
        }
        System.out.println();
        System.out.println("El mayor es: "+maxNumber);
        System.out.println("El menor es: "+minNumber);
        System.out.println("La media es: "+average);
    }
}
