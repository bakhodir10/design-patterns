package strategy.sorting;

/*
    The strategy pattern:
        - defines a family of algorithms,
        - encapsulates each algorithm, and
        - makes the algorithms interchangeable within that family.
*/
public class Main {
    public static void main(String[] args) {
        // given array with little size
        int arr[] = new int[]{3, 2, 5};
        Context context = new Context(new BubbleSort());
        context.sort(arr);

        // given array with many element element
        arr = new int[]{6, 1, 4, 0, 8, 9, 7, 3, -4, 6};
        context.setStrategy(new QuickSort());
        context.sort(arr);
    }
}
