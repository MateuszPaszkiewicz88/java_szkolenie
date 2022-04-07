package json;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class Sheet {

    @SerializedName("sheet1")
    List<Sample> sample;

    public Sheet(List<Sample> sample) {
        this.sample = sample;
    }
}

