public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        InsertionSort insertionSort = new InsertionSort();

        String[] arr = {"B","A","K","P","H","Q"};
        Integer[] arr2 = {13,32,23,4,55,65,7,48,19,130};
        //quickSort.run(arr2);
        insertionSort.run(arr2);


    }
}