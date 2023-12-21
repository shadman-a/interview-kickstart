import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i > 0 ; i--) {
            int nextNum = i -1;
            if ((arr.get(nextNum)) > (arr.get(i)) ) {
                Collections.swap(arr, nextNum, i);
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(25);
        arr.add(12);
        arr.add(22);
        arr.add(64);
        System.out.println(arr);

        System.out.println(sort(arr));
    }
}
