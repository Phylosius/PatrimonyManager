package school.hei.PatrimonyManager;

import lombok.Data;

@Data
public abstract sealed class Possession permits Money, MaterialGood, LifeTrain {
    private Long amount;
}
