public class QuickSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public void start(){
        sort(0,data.length-1);
    }

    void sort(int left, int right) {
        while (left < right) {
            int pivot = randomPartition(left, right);

            if(pivot - left < right - pivot) {
                sort(left, pivot - 1);
                left = pivot + 1;
            } else {
                sort(pivot + 1, right);
                right = pivot - 1;
            }
        }
    }
    private int randomPartition(int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));
        swap(randomIndex, right);
        return partition(left, right);
    }


    private int partition(int left, int right) {
        T pivot = data[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if(data[j].compareTo(pivot) < 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1,  right);
        return i + 1;
    }

    private void swap(int a, int b) {
        T temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}