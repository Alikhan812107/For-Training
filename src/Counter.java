import java.sql.SQLOutput;

public class Counter {
    int count;

    void increment() {
        int step = 1;
        count += step;
        System.out.println("Count is now " + count);
    }

}
