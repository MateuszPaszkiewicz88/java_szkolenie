public class Zad_3_2 {
    public static void main(String[] args) {
        System.out.println("Obliczanie wartości y = 3x, dla x będącego w przedziale od 0 do 10.");
        int a =0, y;

        do{
            y = 3 *a;
            System.out.println("Dla x =  " + a + ", wartość wyrażenia wynosi: " + y + ".");
            a++;
        }while(a<=10);

    }
}

