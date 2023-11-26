public class Ejercicio3_ejerciciosMatrices {
    public static void main(String[] args) {
        int counter=0;
        int[][] matriz = new int[10][10];

        for (int f=0; f< matriz[0].length; f++){
            for (int c=0; c< matriz.length; c++){
                counter++;
                if (counter>10) counter=1;
                matriz[f][c]= counter;
                System.out.printf("%4d",counter);
            }
            counter--;
            System.out.println();
        }
    }
}
