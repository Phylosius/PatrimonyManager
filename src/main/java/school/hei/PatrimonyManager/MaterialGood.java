package school.hei.PatrimonyManager;

import lombok.Data;

@Data
public class MaterialGood {
    private String name;
    private Long amount;
    private Long value;
    private int annualValueLoss; /// in percent
}
