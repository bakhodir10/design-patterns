package strategy.sorting;

public class Context {
    private Sorting sorting;

    public Context(Sorting sorting) {
        this.sorting = sorting;
    }

    public void setStrategy(Sorting sorting) {
        this.sorting = sorting;
    }

    public int[] sort(int[] arr) {
        return this.sorting.sort(arr);
    }
}
