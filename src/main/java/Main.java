import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        QuickSort quickSort = new QuickSort();
        InsertionSort insertionSort = new InsertionSort();

        String[] arter = txtToArray("src/main/resources/arter.txt");
        Integer[] arr2 = {13,32,23,4,55,65,7,48,19,130};
        quickSort.run(arter);
        insertionSort.run(arter);


    }

    public static String[] txtToArray(String txt) throws IOException {
        return Files.readAllLines(Paths.get(txt)).toArray(String[]::new);
    }
}