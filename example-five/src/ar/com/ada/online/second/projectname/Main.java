package ar.com.ada.online.second.projectname;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;
        int triangleArea;
        int rectangleArea;
        int3 totalArea;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el lado A");
        sideA = keyboard.nextInt();

        System.out.println("Ingrese el lado B");
        sideB = keyboard.nextInt();

        System.out.println("Ingrese el lado C");
        sideC = keyboard.nextInt();

        triangleArea = (sideB * (sideA - sideC)) / 2;

        rectangleArea = sideB * sideC;

        totalArea = triangleArea + rectangleArea;

        System.out.println("El área total de la figura es: " + totalArea);

    }
}
