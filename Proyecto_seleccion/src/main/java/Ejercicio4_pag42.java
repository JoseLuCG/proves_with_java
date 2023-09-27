import java.util.Scanner;

public class Ejercicio4_pag42 {
    public static int sumWorkHour(int workHour){
        int totalHours;
        int ordinaryHour= 12;

        totalHours = ordinaryHour * workHour;
        return totalHours;
    }
    public static int sumExtraHours(int workHour){
        int extraHour= 16;
        int totalHours;
        int extraHoursWorked;
        int extraHoursTotal;

        extraHoursWorked = workHour-40;
        extraHoursTotal = extraHoursWorked * extraHour;
        totalHours = (40*12) + extraHoursTotal ;

        return totalHours;
    }
    public static void main(String[] args) {
        int workHour;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe las horas trabajadas esta semana:");
        workHour=sc.nextInt();

        if (workHour<=40){
            System.out.println("Te corresponden "+sumWorkHour(workHour)+" Euros");
        } else if (workHour>40) {
            System.out.println("Te corresponden "+sumExtraHours(workHour)+" Euros");
        }
    }
}
