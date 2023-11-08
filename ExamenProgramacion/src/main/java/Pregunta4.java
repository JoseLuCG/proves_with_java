import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, res=1, mayor, menor;

        // Pedimos al usuario valores mayores que 0:
        do {
            //Solicitamos los numeros:
            System.out.println("Escribe el primer numero positivo:");
            numero1 = sc.nextInt();
            System.out.println("Escribe el segundo numero:");
            numero2 = sc.nextInt();
        }while (numero1<0 || numero2<0);
        //Si el numero dos es mayor que el uno cambiamo su posicion.
        if (numero1>numero2){
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2; menor = numero1;
        }
        //Calculamos sus restos:
        do {
            res = mayor%menor;
            mayor = menor;
            menor= res;
        } while (res != 0);
        System.out.println("El MCD ("+numero1+","+numero2+")="+mayor);
    }
}
