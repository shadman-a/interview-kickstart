import java.util.ArrayList;
import java.util.Collections;

public class SelectionSortArrayList {
  static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {

    for (int i = 0; i < arr.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.size(); j++) {
        if (arr.get(j) < arr.get(minIndex)) {
          minIndex = j;
        }
      }

      Collections.swap(arr, minIndex, i);
    }

    return arr;
  }

  public static void main(String[] args) {

    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(64);
    arr.add(25);
    arr.add(12);
    arr.add(22);
    arr.add(11);

    System.out.println(selection_sort(arr));

  }
}
