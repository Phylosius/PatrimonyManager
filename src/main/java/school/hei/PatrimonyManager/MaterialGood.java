package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public final class MaterialGood extends DepreciablePossession {
    private LocalDate acquisitionDate;
}
