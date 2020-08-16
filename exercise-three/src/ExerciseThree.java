import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        int base, height, area;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo: ");
        base = keyboard.nextInt();

        System.out.println("Ingrese la altura del rectángulo: ");
        height = keyboard.nextInt();

        area = base + height;

        System.out.println("El área del rectángulo es: " + area);

    }
}

