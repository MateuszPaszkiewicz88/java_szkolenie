
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import json.Sample;
import json.Sheet;
import org.apache.log4j.Logger;

import java.awt.image.SampleModel;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JsonLoader {

    final static Logger logger = Logger.getLogger(JsonLoader.class);

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        Reader reader = new FileReader("/home/mateuszpaszkiewicz/Java/java_szkolenie/JsonLoader/src/main/resources/json.json");

        JsonElement elements = gson.fromJson(reader,JsonElement.class);
        Sheet sheet = gson.fromJson(elements, Sheet.class);

        System.out.println(sheet);
    }

}

