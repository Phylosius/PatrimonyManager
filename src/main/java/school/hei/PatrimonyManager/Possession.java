package school.hei.PatrimonyManager;

import lombok.Data;

@Data
public abstract sealed class Possession permits DepreciablePossession, LifeTrain {
    protected String name;
    protected Money value;
}
