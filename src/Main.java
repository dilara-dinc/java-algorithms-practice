import searching.BinarySearch;
import sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 3};

        SelectionSort.sort(numbers);

        int index = BinarySearch.search(numbers, 9);

        System.out.println("Index of 9: " + index);
    }
}
