package school.hei.PatrimonyManager;

import lombok.EqualsAndHashCode;

import java.time.Duration;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
public sealed class DepreciablePossession extends Possession permits MaterialGood, BankAccount{
    private LocalDate lastDepreciationDate;
    private final DepreciationRate depreciationRate;

    public DepreciablePossession(String name, Money value,
                                 LocalDate lastDepreciationDate, DepreciationRate depreciationRate)
    {
        super(name, value);
        this.lastDepreciationDate = lastDepreciationDate;
        this.depreciationRate = depreciationRate;
    }

    public Money getValueAt(LocalDate date) {
        Duration depreciationPeriod = depreciationRate.getPeriod();
        Duration timeSinceLastDepreciation = Duration.between(lastDepreciationDate, date);

        double depreciationRatio = (double) timeSinceLastDepreciation.dividedBy(depreciationPeriod);

        Money valueAfterDepreciation = new Money();
        Double currentAmount = value.getAmount();

        valueAfterDepreciation.setCurrency(value.getCurrency());
        valueAfterDepreciation.setAmount(
                currentAmount * Math.pow(depreciationRate.getRate(), depreciationRatio)
        );

        return valueAfterDepreciation;
    }

    public void applyDepreciation(LocalDate date) {
        lastDepreciationDate = date;
        value = getValueAt(date);
    }
}
