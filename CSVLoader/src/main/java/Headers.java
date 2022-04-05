import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Headers {
    Integer year;
    String industry_code;
    String industry_name;
    String rme_size_grp;
    String variable;
    String value;
    String unit;

    public Headers(Integer year, String industry_code, String industry_name, String rme_size_grp, String variable, String value, String unit) {
        this.year = year;
        this.industry_code = industry_code;
        this.industry_name = industry_name;
        this.rme_size_grp = rme_size_grp;
        this.variable = variable;
        this.value = value;
        this.unit = unit;
    }
}
