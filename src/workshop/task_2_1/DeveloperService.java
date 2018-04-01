package workshop.task_2_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class DeveloperService {

    public static List<String> getLanguages(List<Developer> team)
    {
        //team.stream().flatMap(x -> x.getLanguages())
        return team.stream().flatMap(x -> x.getLanguages().stream()).distinct().collect(Collectors.toList());
    }


}
