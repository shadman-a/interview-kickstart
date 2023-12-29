import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
  public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
    quickSort(arr, 0, arr.size() - 1);
    return arr;
}

private static void quickSort(ArrayList<Integer> arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);  // Before pi
        quickSort(arr, pi + 1, high); // After pi
    }
}

private static int partition(ArrayList<Integer> arr, int low, int high) {
    int pivot = arr.get(high);  
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr.get(j) <= pivot) {
            i++;
            Collections.swap(arr, i, j);
        }
    }

    Collections.swap(arr, i + 1, high);

    return i + 1;
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
