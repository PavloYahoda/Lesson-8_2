
public class Sorter {

    Sort sorting;

    public Sorter(Sort sorting) {

        this.sorting = sorting;
    }


    public int[] sort(int[] myArray) {

        sorting.sort(myArray);
        return myArray;
    }
}
