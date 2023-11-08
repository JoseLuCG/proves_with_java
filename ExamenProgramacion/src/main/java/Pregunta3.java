import java.util.Arrays;
import java.util.Random;

public class Pregunta3 {
    public static void main(String[] args) {
        int[] temperaturaMedia = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "mayo","Junio",
                            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Random random = new Random();
        int maxTemp = Integer.MIN_VALUE, mediaTemperatura=0;
        int temperatura, sumTemperatura=0;

        //Colocamos la temperatura aleatoria en los meses:
        for (int mes=0; mes<temperaturaMedia.length; mes++){
            temperatura  = random.nextInt(-5, 51);
            temperaturaMedia[mes] = temperatura;
        }

        //calculamos la temperatura más alta:
        for (int mes=0; mes<temperaturaMedia.length; mes++){
            if (temperaturaMedia[mes]>maxTemp){
                maxTemp = temperaturaMedia[mes];
            }
        }

        //Calculamos la temperatura media:
        for (int mes=0; mes<temperaturaMedia.length; mes++){
            sumTemperatura = sumTemperatura + temperaturaMedia[mes];
            mediaTemperatura = sumTemperatura/temperaturaMedia.length;
        }

        //Mostramos el array:
        for (int mes=0; mes<temperaturaMedia.length; mes++){
            System.out.println(temperaturaMedia[mes]+"  "+meses[mes]);
        }

        //Mostramos los resultados del programa:
        System.out.println();
        System.out.println("La temperatura mas alta es de: "+maxTemp);
        System.out.println("la temperatura media anual es de: "+mediaTemperatura);
    }
}
