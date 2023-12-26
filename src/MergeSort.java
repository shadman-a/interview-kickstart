import java.util.ArrayList;

public class MergeSort {

  public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int middle = arr.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, middle));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(middle, arr.size()));

        sort(left);
        sort(right);
        merge(arr, left, right);

        return arr;
    }

    private static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        int leftIndex = 0, rightIndex = 0, arrIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                arr.set(arrIndex++, left.get(leftIndex++));
            } else {
                arr.set(arrIndex++, right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            arr.set(arrIndex++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            arr.set(arrIndex++, right.get(rightIndex++));
        }
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
