package school.hei.PatrimonyManager;

import lombok.Data;

@Data
public final class Money {
    private Double amount;
    private Currency currency = new Currency("USD", 1d);
}
