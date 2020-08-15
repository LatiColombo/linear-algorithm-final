import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("programa que suma dos numeros dados");

        int firstNumber;
        int secondNumber;
        int result;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        firstNumber = keyboard.nextInt();

        System.out.println("Ingrese el segundo1 número: ");
        secondNumber = keyboard.nextInt();

        result = firstNumber + secondNumber;

        System.out.println("El resultado es: " + result);
    }
}
