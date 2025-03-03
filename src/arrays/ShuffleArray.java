package arrays;

import java.util.*;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[2*n];

        for(int i = 0; i < n; i++) {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n];
        }

        return arr;
    }
    public static void main (String ...args) {
        int [] arr = {2,5,1,3,4,7};

        ShuffleArray obj = new ShuffleArray();

        System.out.println(Arrays.toString(obj.shuffle(arr, 3)));
    }
}
