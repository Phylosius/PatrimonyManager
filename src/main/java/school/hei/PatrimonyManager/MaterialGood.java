package school.hei.PatrimonyManager;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@EqualsAndHashCode(callSuper = true)
public final class MaterialGood extends DepreciablePossession {
    private final LocalDate acquisitionDate;

    public MaterialGood(String name, Money value,
                        LocalDate lastDepreciationDate, DepreciationRate depreciationRate,
                        LocalDate acquisitionDate)
    {
        super(name, value, lastDepreciationDate, depreciationRate);
        this.acquisitionDate = acquisitionDate;
    }
}
