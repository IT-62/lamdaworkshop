package workshop.task_1_2;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class Factorial {


    public static long factorial(long i) {
        // implement function body in order all test to complete successfully
        //option 1
        //return LongStream.iterate(1, x -> x+1).limit(i).reduce((acc, x) -> acc *=x).getAsLong();
        //option 2
        return LongStream.rangeClosed(1, i).reduce((acc, x) -> acc*=x).getAsLong();
    }
}
