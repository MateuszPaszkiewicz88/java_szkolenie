import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zad_2_1_a {
    public static void main(String[] args) throws IOException {
        int a,b,c;

        List<Integer> triangles = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program weryfikujący, czy trójkąt jest prostokątny.");
        System.out.println("Podaj długość boku a: ");
        a = Integer.parseInt(br.readLine());
        triangles.add(a);
        System.out.println("Podaj długość boku b: ");
        b = Integer.parseInt(br.readLine());
        triangles.add(b);
        System.out.println("Podaj długość boku b: ");
        c = Integer.parseInt(br.readLine());
        triangles.add(c);

        triangles.sort(Comparator.naturalOrder());
        int side_a = triangles.get(0);
        int side_b = triangles.get(1);
        int side_c = triangles.get(2);
        if(side_a+side_b<=side_c){
            System.out.println("Podane proste nie mogą utworzyć trójkąta");
        }else{
            if(side_a * side_a + side_b * side_b == side_c * side_c){
                System.out.println("Podany trójkąt jest prostokątny.");
            }else {
                System.out.println("Trójkąt nie jest prostokątny.");
            }
        }
    }
}
