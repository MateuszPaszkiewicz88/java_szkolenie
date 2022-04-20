import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_1_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r, result;
        System.out.println("Program obliczający objętość kuli.");
        System.out.println("Proszę podać promień kuli: ");
        r = Double.parseDouble(br.readLine());
        result = ((4/3) * Math.PI * Math.pow(r,3));
        System.out.printf("Objętość kuli wynosi: "+ "%2.2f",result);
    }
}