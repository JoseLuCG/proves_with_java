import java.util.Scanner;

public class Ejercicio2_pag84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[4][5];
        int sumaFilas=0, sumaColumnas=0, sumaTotal=0;

        System.out.println("Escribe 20 numeros:");
        // Cooca los numeros en el array
        for (int f=0; f<4; f++){
            for (int c=0; c<5; c++){
                numbers[f][c] = sc.nextInt();
            }
        }

        //Muestra el Array
        for (int f= 0; f<4; f++){
            sumaFilas=0;
            for (int c=0; c<5; c++){
                System.out.printf("%5d",numbers[f][c]);
                sumaFilas+=numbers[f][c];
            }
            System.out.printf("%5d\n",sumaFilas);
        }
        for (int c=0; c<5; c++){
            sumaColumnas=0;
            for (int f = 0; f<4; f++){
                sumaTotal += numbers[f][c];
                sumaColumnas += numbers[f][c];
            }
            System.out.printf("%5d", sumaColumnas);
        }
        System.out.printf("%5d",sumaTotal);
    }
}
