package school.hei.PatrimonyManager;

import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
public final class BankAccount extends DepreciablePossession{

    public BankAccount(String name, Money value,
                       LocalDate lastDepreciationDate, DepreciationRate depreciationRate) {
        super(name, value, lastDepreciationDate, depreciationRate);
    }
}
