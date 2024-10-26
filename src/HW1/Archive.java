package HW1;

import java.util.HashMap;
import java.util.Map;

public class Archive {
    Map<String, Map<String, Mark>> courseGrades;
    Archive () {
        courseGrades = new HashMap<>();
    }
}
