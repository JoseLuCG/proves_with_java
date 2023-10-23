import java.util.Random;

public class Ejercicio10_pag66 {
    public static void main(String[] args) {
        Random random = new Random();
        int note;

        for (int evNote = 0; evNote<20; evNote++) {
            note = random.nextInt(1,6);
        }
    }
}
