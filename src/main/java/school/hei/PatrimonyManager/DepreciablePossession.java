package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public sealed class DepreciablePossession extends Possession permits MaterialGood, BankAccount{
}
