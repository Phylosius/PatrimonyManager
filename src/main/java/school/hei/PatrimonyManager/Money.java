package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Money extends Possession {
    private MoneyType type;
}
