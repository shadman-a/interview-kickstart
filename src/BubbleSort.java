import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((arr.get(j)) > (arr.get(j+1))) {
                    Collections.swap(arr, j, j+1);
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(33);
        arr.add(20);
        arr.add(12);
        arr.add(22);
        arr.add(64);
        System.out.println(arr);

        System.out.println(sort(arr));
    }
}
