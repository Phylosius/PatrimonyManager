package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public sealed class DepreciablePossession extends Possession permits MaterialGood, BankAccount{
    private LocalDate lastDepreciationDate;
}
