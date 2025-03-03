package arrays;

import java.util.*;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i < n; i++) {
            arr.add(nums[i]);
            arr.add(nums[i+n]);
        }

        for(int i=0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        return nums;
    }
    public static void main (String ...args) {
        int [] arr = {1, 2, 3, 4, 5, 6};

        ShuffleArray obj = new ShuffleArray();

        System.out.println(Arrays.toString(obj.shuffle(arr, 3)));
    }
}
