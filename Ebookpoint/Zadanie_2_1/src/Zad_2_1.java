import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_2_1 {
    public static void main(String[] args) throws IOException {
        int a,b,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program weryfikujący, czy trójkąt jest prostokątny.");
        System.out.println("Podaj długość boku a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj długość boku b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Podaj długość boku b: ");
        c = Integer.parseInt(br.readLine());
        if(a * a + b * b == c * c){
            System.out.println("Podany trójkąt jest prostokątny.");
        }else {
            System.out.println("Trójkąt nie jest prostokątny.");
        }
    }
}
