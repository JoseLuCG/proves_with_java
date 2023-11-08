import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, sumatorio;

        //Pedimos al usuario la altura de la piramide:
        System.out.println("Escribe la altura de la piramide:");
        altura= sc.nextInt();

        //Componemos un bucle para crear las filas.
        for (int fila=1; fila<=altura; fila++){
            //Creamos un bucle para generar los espacios en blanco:
            for (int espacios=0;espacios<altura-(fila-1); espacios++){
                System.out.print(" ");
            }
            sumatorio = 0;
            if (fila == 1) System.out.println(" "+1);
            else {
                for (int i = 1; i <= fila; i++){
                    if (i==1) System.out.print(i);
                    else System.out.print("+"+i);
                    sumatorio+=i;
                }
                System.out.println("="+sumatorio);
            }
            //Creamos un bucle para pintar los números
            /*
            for (int numero=1; numero<fila*2; numero++){
                System.out.print(numero);
            }
             */
        }
    }
}
