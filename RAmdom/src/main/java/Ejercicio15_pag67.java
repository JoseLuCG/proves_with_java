import java.util.Random;

public class Ejercicio15_pag67 {
    public static void main(String[] args) {
        Random random = new Random();
        int group, musicalNote, firstNote =0;

        group = random.nextInt(1, 8);
        switch (group){
            case 1: group = 4; break;
            case 2: group = 8; break;
            case 3: group = 12; break;
            case 4: group = 16; break;
            case 5: group = 20; break;
            case 6: group = 24; break;
            case 7: group = 28; break;
        }



        //Loop for the melodies.
       for (int notes= 0; notes<group; notes++){
           // for the compas.
           for (int note = 0; note<4; note++){
               musicalNote = random.nextInt(1,8);

               if (note == 0 && notes == 0) {
                   firstNote = musicalNote;
               } else if (notes == group -1 && note == 3) {
                   musicalNote = firstNote;
               }
               switch (musicalNote){
                   case 1: System.out.print(" do "); break;
                   case 2: System.out.print(" re "); break;
                   case 3: System.out.print(" mi "); break;
                   case 4: System.out.print(" fa "); break;
                   case 5: System.out.print(" sol "); break;
                   case 6: System.out.print(" la "); break;
                   case 7: System.out.print(" si "); break;
               }
           }
           if (notes == group -1 ){
               System.out.print("||");
           } else System.out.print("|");
       }
        System.out.println();
    }
}
