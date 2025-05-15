package school.hei.PatrimonyManager;

import lombok.Data;

import java.time.Duration;

@Data
public class DepreciationRate {
    private final int rate;
    private Duration period;
}
