import java.util.Arrays;
import java.util.Random;

public class Ejercicio8_pag80 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] temperatureAverage = new int[12];
        int monthTemperature;

        for (int idx=0; idx < 12; idx++) {
            monthTemperature = random.nextInt(0,50);
            temperatureAverage[idx] = monthTemperature;
        }
        System.out.println(Arrays.toString(temperatureAverage));

        for (int month=0; month<temperatureAverage.length; month++) {
            //loop that prints the bars.
            for (int bar=0; bar<temperatureAverage[month];bar++){
                System.out.print("H");
            }
            System.out.println(" ("+temperatureAverage[month]+")");
        }
    }
}
