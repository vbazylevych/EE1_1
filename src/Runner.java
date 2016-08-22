import com.goit.javaonline3.ee1.MyTable;
import com.goit.javaonline3.ee1.StopwatchForArrayList;

/**
 * Created by vbazylevych on 8/9/2016.
 */
public class Runner {

    public static void main(String[] arg) {
        MyTable.createTable(10000);
        MyTable.createTable(100000);
        MyTable.createTable(1000000);
    }
}
