import java.util.ArrayList;

public class InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j;
            for (j = i - 1; j >= 0 && arr.get(j) > key; j--) {
                arr.set(j + 1, arr.get(j));
            }
            arr.set(j + 1, key);
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
