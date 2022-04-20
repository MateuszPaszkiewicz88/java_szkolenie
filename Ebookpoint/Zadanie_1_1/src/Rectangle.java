import java.io.IOException;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){

        double a, b, field;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość boku a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj długość boku b: ");
        b = scanner.nextDouble();
        field = a * b;
        System.out.println("Pole prostokąta wynosi: "+ field +".");
    }
}
