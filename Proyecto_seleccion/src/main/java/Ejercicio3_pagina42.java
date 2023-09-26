import java.util.Scanner;

public class Ejercicio3_pagina42 {
    public static void main(String[] args) {
        int numUser;
        Scanner sc= new Scanner(System.in);
        String[] days = {
                "Lunes",
                "Martes",
                "Miercoles",
                "Jueves",
                "Viernes",
                "Sabado",
                "Domingo"};

        System.out.println("Escribe el numero del 1 al 7.");
        numUser=sc.nextInt();

        System.out.println(days[numUser-1]);
    }
}
