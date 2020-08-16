package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int circleRadius;
        double py = 3.1416;
        double circleCircunference;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo.");
        circleRadius = keyboard.nextInt();

        circleCircunference = (double)(circleRadius * py * circleRadius);

        System.out.println("La circunferencia del círculo de radio " + circleRadius + " es: " + circleCircunference);

    }
}
