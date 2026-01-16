import searching.LinearSearch;
import sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 3};

        BubbleSort.sort(numbers);

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int index = LinearSearch.search(numbers, 9);
        System.out.println("\nIndex of 9: " + index);
    }
}
