package json;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString

public class Sample{

    @SerializedName("Serial Number")
    private BigDecimal serialNumber;

    @SerializedName("Company Name")
    private String companyName;

    @SerializedName("Employee Markme")
    private String employeeMark;

    @SerializedName("Description")
    private String description;

    @SerializedName("Leave")
    private Integer leave;

    public Sample(BigDecimal serialNumber, String companyName, String employeeMark, String description, Integer leave) {
        this.serialNumber = serialNumber;
        this.companyName = companyName;
        this.employeeMark = employeeMark;
        this.description = description;
        this.leave = leave;
    }

}
