public class Ejercicio22_pag51 {
    public static boolean isDivisibleBy (int number){
        boolean result = true;

        for (int i=2; i<number; i++){
            if (number%i == 0) result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        // Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
        for (int idx = 2; idx<=100; idx++) {
            boolean divisible = isDivisibleBy(idx);

            if ( divisible && idx%idx==0 && idx%1==0 ){
                System.out.println("el numero "+idx+" es primo");
            } else System.out.println("el numero "+idx+" no es primo");
        }
    }
}
