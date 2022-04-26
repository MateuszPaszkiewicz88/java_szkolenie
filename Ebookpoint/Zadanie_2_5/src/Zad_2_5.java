import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad_2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = (int) (Math.random()*9);
        System.out.println("Spróbój odgadnąć liczbę między 0 a 9.");
        System.out.println("Podaj swój typ: ");
        int guess = Integer.parseInt(br.readLine());
        if (guess == answer){
            System.out.println("Brawo! Odgadłeś prawidłowo!");
        }else{
            System.out.println("Niestety nie udało Ci się. Prawidłowa liczba to "+ answer+".");
        }
    }
}
