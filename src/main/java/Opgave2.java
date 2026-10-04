import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Opgave2 {
    public static void run() throws IOException {
        getNewAction();
    }
    public static String[] txtToArray(String txt) throws IOException {
        return Files.readAllLines(Paths.get(txt)).toArray(String[]::new);
    }

    public static void getNewAction() throws IOException {
        System.out.println("What do you want to do?");
        System.out.println("1 : Run Insertion Sort");
        System.out.println("2 : Run Quick Sort");
        System.out.println("3 : Run Quick Sort then search for Piratfisk");
        System.out.println("4 : Quit");
        int action = Utils.reader(1, 4);

        switch (action) {
            case 1:
                runInsertionSort();
                getNewAction();
                break;
            case 2:
                runQuickSort();
                getNewAction();
                break;
            case 3:
                runQuickSortBinarySearch();
                getNewAction();
                break;
        }
    }

    public static void runQuickSort() throws IOException {
        QuickSort<String> quickSort = new QuickSort<>();
        String[] animalArr = txtToArray("src/main/resources/arter.txt");
        quickSort.run(animalArr);
    }

    public static void runQuickSortBinarySearch() throws IOException {
        BinarySearch<String> binarySearch = new BinarySearch<>();
        QuickSort<String> quickSort = new QuickSort<>();
        String[] animalArr = txtToArray("src/main/resources/arter.txt");


        String[] sortedAnimals = quickSort.run(animalArr);
        binarySearch.run(sortedAnimals, "Piratfisk");
    }

    public static void runInsertionSort() {
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] numArr = {13,32,23,4,55,65,7,48,19,130};
        System.out.println("Before insertion sort: " + Arrays.toString(numArr));
        insertionSort.run(numArr);
    }
}
