package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public final class Money extends Possession {
    private Currency currency = new Currency("USD", 1d);
}
