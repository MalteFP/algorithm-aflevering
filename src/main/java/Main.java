import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        QuickSort<String> quickSort = new QuickSort<>();
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        BinarySearch<String> binarySearch = new BinarySearch<>();


        String[] animalArr = txtToArray("src/main/resources/arter.txt");
        Integer[] numArr = {13,32,23,4,55,65,7,48,19,130};
        insertionSort.run(numArr);
        String[] sortedAnimals = quickSort.run(animalArr);
        binarySearch.run(sortedAnimals, "Piratfisk");


    }

    public static String[] txtToArray(String txt) throws IOException {
        return Files.readAllLines(Paths.get(txt)).toArray(String[]::new);
    }
}