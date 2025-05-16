package school.hei.PatrimonyManager;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract sealed class Possession permits DepreciablePossession, LifeTrain {
    protected String name;
    protected Money value;
}
