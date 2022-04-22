import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_2_3 {
    public static void main(String[] args) throws IOException {
        double a, b, c, x, x1, x2, delta = 0;
        int howManyPower = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj wartość parametru 'a'.");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj wartość parametru 'b'.");
        b = Double.parseDouble(br.readLine());
        System.out.println("Podaj wartość parametru 'c'.");
        c = Double.parseDouble(br.readLine());
        if (a == 0) {
            System.out.println("Rówanie jest równaniem liniowy.");
        } else delta = (Math.pow(b, 2) - (4 * a * c));
        if (delta < 0) howManyPower = 0;
        if (delta == 0) howManyPower = 1;
        if (delta > 0) howManyPower = 2;
        System.out.println(howManyPower);
        switch (howManyPower) {
            case 0 -> System.out.println("Brak pieriastków");
            case 1 -> {
                x = -b / (2 * a);
                System.out.println("Rozwiązaniem równania jest x = " + x);
            }
            case 2 -> {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Wartość x1 = " + x1);
                System.out.println("Wartość x2 = " + x2);
            }
        }
    }
}
