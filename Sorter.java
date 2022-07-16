
public class Sorter implements Sort{

    Sort sorting;

    public Sorter(Sort sorting) {

        this.sorting = sorting;
    }

    @Override
    public int[] sort(int[] myArray) {

        sorting.sort(myArray);
        return myArray;
    }
}
