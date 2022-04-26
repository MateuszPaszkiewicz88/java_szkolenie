import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_2_4 {
    public static void main(String[] args) throws IOException {
        double a,b,c,x;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program obliczający wartość parametru 'x' w równaniu ax + b = c.");
        System.out.println("Proszę podać wartość 'a': ");
        a = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Proszę podać wartość 'b': ");
        b = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Proszę podać wartość 'c': ");
        c = Double.parseDouble(bufferedReader.readLine());
        if(a==0){
            System.out.println("Równanie nie ma rozwiązania.");
        }else{
            x = ((c - b)/a);
            System.out.printf("Wartość parametru x wynosi: " + "%2.2f",x);
        }
    }
}
