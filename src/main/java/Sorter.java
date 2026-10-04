import java.util.Arrays;

public abstract class Sorter<T extends Comparable<T>>{
    protected T[] data;
    T[] run(T[] arr) {
        data = arr;
        start();
        System.out.println(getClass().getSimpleName() + ": " + Arrays.toString(data));
        return data;
    }


    public abstract void start();
}
