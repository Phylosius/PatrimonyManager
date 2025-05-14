package school.hei.PatrimonyManager;

import lombok.Data;

import java.time.Duration;

@Data
public class LifeTrain {
    private String name;
    private String duration;
    private Long amount;
    private Money moneySource;
    private Duration applyEach;
}
