import java.util.Scanner;

public class Ejercicio8_pag85 {
    public static void main(String[] args) {
        /*
        Ejercicio 8
        Escribe un programa que, dada una posición en un tablero de ajedrez,
        nos diga a qué casillas podría saltar un alfil que se encuentra en esa
        posición. Como se indica en la figura, el alfil se mueve siempre en
        diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con
        las letras de la “a” a la “h” y las filas se indican del 1 al 8.
         */
        Scanner sc= new Scanner(System.in);
        int[][] tablero = new int[8][8];
        String position;
        char[] letras = {'a','b','c','d','e','f','g','h'};
        // Solicitamos la posición del arfil:
        System.out.println("Introduce la posicicion del arfil:");
        position = sc.next().toLowerCase();
        char col = position.charAt(0);
        char fil = position.charAt(1);

        //Parseo los datos del usuario a datos validos para la matriz.
        int c = (int)col-97;
        int f = 8 - ((int)fil-48);

        System.out.println("Las posiciones en las que puede ubicarse el arfil son:");
        // ---------- Recorremos las diagonales principales: ----------
        // ----- Diagonal principal ascendente -----
        int pc=c;
        for (int pf=f-1; pf>=0 && pc>=0; pf--){
            pc--;
            System.out.print("("+letras[pc]+""+(8-pf)+")");
        }
        System.out.println();
        // ----- Diagonal principal descendente -----
        int dpc=c;
        for (int dr=f+1; dr<8 && dpc<8; dr++){
            dpc++;
            System.out.print("("+letras[dpc]+""+(8-dr)+")");
        }
        System.out.println();
        // ---------- Recorremos las diagonales secundarias: ----------
        // ----- Diagonal secundaria ascendente: -----
        int dc=c;
        for (int dr=f-1; dr>=0 && dc>=0; dr--){
            // dr= fila diagonal: dc = columna diagonal;
            dc++;
            System.out.print("("+letras[dc]+""+(8-dr)+")");
        }
        System.out.println();
        // ----- Diagonal secundaria descendente: -----
        int dsc=c-1;
        for (int dsr=f+1; dsr<8 && dsc>=0; dsr++){
            System.out.print("("+letras[dsc]+","+(8-dsr)+")");
            dsc--;
        }

    }
}
