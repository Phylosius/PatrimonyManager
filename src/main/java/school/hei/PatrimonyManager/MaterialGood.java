package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public final class MaterialGood extends Possession {
    private String name;
    private Long value;
    private int annualValueLoss; /// in percent
}
