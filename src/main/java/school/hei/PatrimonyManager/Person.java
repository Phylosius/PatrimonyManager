package school.hei.PatrimonyManager;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String name;
    private List<Possession> possessions;
}
