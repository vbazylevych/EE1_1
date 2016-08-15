import com.goit.javaonline3.ee1.StopwatchForArrayList;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class Runner {
    public static void main(String[] arg) {
      /*  System.out.println("10000  " + StopwatchForArrayList.countAverageArrayListPopulation(10000));
        System.out.println("100000  " + StopwatchForArrayList.countAverageArrayListPopulation(100000));
        System.out.println("1000000  " + StopwatchForArrayList.countAverageArrayListPopulation(1000000));
        System.out.println("__________________________________________________________________");*/

        System.out.println("10000  " + StopwatchForArrayList.countAverageArrayListContains(10000));
        System.out.println("100000  " + StopwatchForArrayList.countAverageArrayListContains(100000));
        System.out.println("1000000  " + StopwatchForArrayList.countAverageArrayListContains(1000000));

       // StopwatchForArrayList.countAverageArrayListContains(1000000);

    }
}
