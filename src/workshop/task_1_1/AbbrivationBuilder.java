package workshop.task_1_1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class AbbrivationBuilder {


    public static String build(List<String> list) {
        StringBuilder resStringBuilder = new StringBuilder(list.size());
        list.stream().forEach(x -> {
            if(x != null && x.length() > 0)
                resStringBuilder.append(x.charAt(0));
        });
        return resStringBuilder.toString();
    }

}
