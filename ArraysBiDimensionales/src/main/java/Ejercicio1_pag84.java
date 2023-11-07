public class Ejercicio1_pag84 {
    public static void main(String[] args) {
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        for (int f= 0; f<3; f++){
            System.out.printf("Fila%2d",f);
            for (int c=0; c<6; c++){
                System.out.printf("%4d", num[f][c]);
            }
            System.out.println();
        }
    }
}
