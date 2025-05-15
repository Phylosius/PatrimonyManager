package school.hei.PatrimonyManager;

import lombok.Data;

@Data
public abstract sealed class Possession permits DepreciablePossession, LifeTrain {
    private String name;
    private Money value;
}
