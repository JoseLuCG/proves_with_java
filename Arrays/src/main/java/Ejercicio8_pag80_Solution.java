import java.util.Scanner;

public class Ejercicio8_pag80_Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] mes = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        int[] temperatura = new int[12];
        int i, j;

        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        for (i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
            temperatura[i] = sc.nextInt();
        }

        System.out.println();

        for (i = 0; i < 12; i++) {
            System.out.printf(azul + "%12s " + verde + "=>", mes[i]);
            for (j = 0; j < temperatura[i]; j++) {
                System.out.print(morado + "H");
            }
            System.out.println(naranja + " " + temperatura[i] + "C" + blanco);
        }
    }
}
