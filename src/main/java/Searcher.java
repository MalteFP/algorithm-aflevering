public abstract class Searcher <T extends Comparable<T>>{
    protected T[] data;
    protected T goal;
    protected int index = -1;
    int run(T[] arr, T searchFor) {
        data = arr;
        goal = searchFor;
        start();

        System.out.println(getClass().getSimpleName() + ": Searching for " + searchFor + " At index: " + index);
        return index;
    }

    public abstract void start();
}
