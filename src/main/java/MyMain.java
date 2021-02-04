import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, Integer.MIN_VALUE);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (list.size() < 1) {
            return true;
        }
        boolean currVal = list.get(0) >= i;
        i = list.get(0);
        list.remove(0);
        return currVal && isSortedRec(list, i);
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if (i == arr.length) {
            return count == 0;
        }
        return hasCountCopiesRec(arr, x, count - ((arr[i] == x) ? 1 : 0), i+1);
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {
        int middleBound = lowerBound + (upperBound-lowerBound)/2;
        if (lowerBound >= upperBound) {
            return false;
        } else if (arr[middleBound] == num) {
            return true;
        }
        return binarySearchRec(arr, num, (arr[middleBound] < num) ? middleBound + 1 : lowerBound, (arr[middleBound] < num) ? upperBound : middleBound);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        int[] arr1 = new int[]{1, 2, 3, 4};
        System.out.println(binarySearch(arr1, 2));
    }
}
