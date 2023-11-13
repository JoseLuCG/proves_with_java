import java.util.Random;

public class Ejercicio6_pag85 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][]n = new int[6][10];
        boolean existe;
        int valor=0;

        for (int i=0; i< n.length*n[0].length; i++){

            do {
                existe = false;
                valor = rnd.nextInt(1,101);
                for (int k=0; k<i; k++){
                    if (n[k/10][k%10] == valor) {existe = true; k=i;}
                }
            }while (existe == true);
            n[i/10][i%10] = valor;
        }

        for (int i=0; i<n.length; i++){
            for (int b=0; b< n.length; b++){
                System.out.printf("%4d",  n[i][b]);
            }
            System.out.println();
        }
    }
}
