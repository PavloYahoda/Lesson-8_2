import java.util.Arrays;

public class HomeWork8 {

    public static final int[] MY_ARRAY = {6,8,3,9,0,4,7,5,2,1};

    public static void main(String[] args) {
        Sorter bubbleSort = new Sorter(new BubbleSort());
        Sorter selectionSort = new Sorter(new SelectionSort());


        System.out.println(Arrays.toString(bubbleSort.sort(MY_ARRAY)));
        System.out.println(Arrays.toString(selectionSort.sort(MY_ARRAY)));

    }
}
