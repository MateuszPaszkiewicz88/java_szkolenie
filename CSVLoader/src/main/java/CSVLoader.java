
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;

public class CSVLoader {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","roczny.csv");

        Files.lines(path)
                .skip(1)
                .map( line -> {
                    String[] fields = line.split(",");
                    return new Headers(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4],fields[5],fields[6]);
                }).forEach(System.out::println);

    }
}
