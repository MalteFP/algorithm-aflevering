public class InsertionSort<T extends Comparable<T>> extends Sorter<T> {
    @Override
    public void start() {
        for(int i = 1; i < data.length; i++){

            T key = data[i];
            int j = i - 1;
            while(j >= 0 && data[j].compareTo(key) > 0){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }
}
