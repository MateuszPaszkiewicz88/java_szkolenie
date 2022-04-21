import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_1_7 {
    public static void main(String[] args) throws IOException {
        double a,b,suma,roznica,iloraz,iloczyn;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program obliczający sumę, różnicę iloraz oraz iloczyn dwóch liczb.");
        System.out.println("Podaj pierwszą liczbę: ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Podaj drugą liczbę: ");
        b = Double.parseDouble(br.readLine());

        suma = a+b;
        roznica = a-b;
        iloraz = a/b;
        iloczyn = a*b;

        System.out.printf("Suma = " + "%2.2f \n", suma);
        System.out.printf("Różnica = " + "%2.2f \n", roznica);
        System.out.printf("Iloraz = " + "%2.2f \n", iloraz);
        System.out.printf("Iloczyn = " + "%2.2f \n", iloczyn);
    }
}
