package school.hei.PatrimonyManager;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public final class LifeTrain extends Possession{
    private BankAccount meansOfIncome;
    private Duration applyEach;

    public LifeTrain(String name, Money value,
                     BankAccount meansOfIncome, Duration applyEach) {
        super(name, value);
        this.meansOfIncome = meansOfIncome;
        this.applyEach = applyEach;
    }

    private Money getTotalValueIn(Duration duration) {
        double applianceCoefficient = (double) applyEach.dividedBy(duration);
        Money value = new Money();

        value.setCurrency(value.getCurrency());
        value.setAmount(value.getAmount() * applianceCoefficient);

        return value;
    }
}
