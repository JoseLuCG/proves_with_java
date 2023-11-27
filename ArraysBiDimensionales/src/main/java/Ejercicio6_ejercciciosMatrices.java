import java.util.Scanner;

public class Ejercicio6_ejercciciosMatrices {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int[][] cuadrado;
        int f=0;

        System.out.println("introduce la dimension");
        n=sc.nextInt();
        cuadrado = new int[n][n];

        int c= cuadrado[0].length/2;
        cuadrado[f][c]=1;

        for (int p=2; p<= cuadrado.length*cuadrado.length; p++){
            if ( (p-1) % n != 0 ){
                f--;
                c++;
                if (f==-1) f=n-1;
                if (c==n) c=0;
            } else f++;
            cuadrado[f][c]=p;
        }
        for (int fc = 0; fc<n; fc++){
            for (int cc=0; cc<n; cc++){
                System.out.printf("%3d",cuadrado[fc][cc]);
            }
            System.out.println();
        }
    }
}
