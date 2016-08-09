import com.goit.javaonline3.ee1.Stopwatch;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class Runner {
    public static void main(String[] arg) {
        System.out.println("10000  " + Stopwatch.countAverageArrayListPopulation(10000));
        System.out.println("100000  " + Stopwatch.countAverageArrayListPopulation(100000));
        System.out.println("1000000  " + Stopwatch.countAverageArrayListPopulation(1000000));
        System.out.println("__________________________________________________________________");

        System.out.println("10000  " + Stopwatch.countAverageArrayListAdd(10000));
        System.out.println("100000  " + Stopwatch.countAverageArrayListAdd(100000));
        System.out.println("1000000  " + Stopwatch.countAverageArrayListAdd(1000000));

    }
}
