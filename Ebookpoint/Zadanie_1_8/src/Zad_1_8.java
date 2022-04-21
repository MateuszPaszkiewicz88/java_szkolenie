import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_1_8 {
    public static void main(String[] args) throws IOException {
        double a,b,suma,roznica,iloraz,iloczyn;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program obliczający polę prostokąta.");
        try {
            System.out.println("Podaj pierwszą liczbę: ");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj drugą liczbę: ");
            b = Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Podana wartość musi być liczbą.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        iloczyn = a*b;

        System.out.printf("Pole prostokąta wynosi = " + "%2.2f \n", iloczyn);
    }
}
