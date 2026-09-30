import java.util.Arrays;

public abstract class Sorter<T extends Comparable<T>>{
    protected T[] data;
    void run(T[] arr) {
        data = arr;
        start();
        System.out.println(Arrays.toString(data));
    }


    public abstract void start();
}
