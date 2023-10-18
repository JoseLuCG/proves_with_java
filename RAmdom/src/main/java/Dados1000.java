public class Dados1000 {
    public static void main(String[] args) {
        /*
         * Lanzar 1000 veces un dado y comprobar cuantas veces sale cada cara.
         */
        int number, counter1 = 0, counter2=0, counter3=0, counter4=0, counter5=0, counter6=0;

        for (int throwDice =1; throwDice<=1000; throwDice++){
            number =(int)(Math.random()*6)+1;
            if (number == 1){
                counter1++;
            } else if (number == 2) {
                counter2++;
            } else if (number == 3) {
                counter3++;
            } else if (number == 4) {
                counter4++;
            } else if (number == 5) {
                counter5++;
            } else if (number == 6) {
                counter6++;
            }
        }
        System.out.println("el numero 1 salio: "+counter1+" veces");
        System.out.println("el numero 2 salio: "+counter2+" veces");
        System.out.println("el numero 3 salio: "+counter3+" veces");
        System.out.println("el numero 4 salio: "+counter4+" veces");
        System.out.println("el numero 5 salio: "+counter5+" veces");
        System.out.println("el numero 6 salio: "+counter6+" veces");
    }
}
