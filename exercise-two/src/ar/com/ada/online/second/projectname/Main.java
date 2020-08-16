package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int gradeA, gradeB, gradeC, gradeD;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la primer nota");
        gradeA = keyboard.nextInt();
        System.out.println("Ingrese la segunda nota");
        gradeB = keyboard.nextInt();
        System.out.println("Ingrese la tercera nota");
        gradeC = keyboard.nextInt();
        System.out.println("Ingrese la cuarta nota");
        gradeD = keyboard.nextInt();

        average = (double)(gradeA + gradeB + gradeC + gradeD) / 4;

        System.out.println("El promedio de las notas es: " + average);

    }
}
