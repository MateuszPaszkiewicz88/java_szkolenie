import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_2_2 {
    public static void main(String[] args) {
        double a, b, c,x,x1,x2,delta;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program do obliczajjacy równania kwadratowe");

        try {
            System.out.println("Podaj wartość parametru 'a'.");

            a = Double.parseDouble((br.readLine()));
            System.out.println("Podaj wartość parametru 'b'.");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj wartość parametru 'c'.");
            c = Double.parseDouble((br.readLine()));
        } catch (IOException e) {
            throw new RuntimeException("Podana wartość musi być liczbą.");
        }
        delta = (b * b) - (4 * a * c);
        System.out.println(delta);
        if(a==0){
            System.out.println("Jeżeli wartość parametru a wynosi 0, równanie staje się równaniem liniowym.");
        } else if (delta>0) {
            x1=(-b - Math.sqrt(delta))/(2*a);
            x2=(-b + Math.sqrt(delta))/(2*a);
            System.out.println("Wartość x1 = "+ x1);
            System.out.println("Wartość x2 = "+ x2);
        } else if (delta == 0) {
            x=-b/(2*a);
            System.out.println("Równanie ma dokładnie jedno rozwiązanie: "+ x);
        }else {
            System.out.println("Rówannie nie posiada rozwiązań.");
        }
    }
}
