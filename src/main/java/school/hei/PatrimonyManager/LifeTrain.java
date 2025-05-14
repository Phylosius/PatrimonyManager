package school.hei.PatrimonyManager;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Duration;

@EqualsAndHashCode(callSuper = true)
@Data
public class LifeTrain extends Possession{
    private String name;
    private String duration;
    private Money moneySource;
    private Duration applyEach;
}
