package arrays;
import java.util.*;
import java.io.*;


public class RemoveDuplicatesBrute {
    public int[] removeDuplicates(int[] nums) {
        Set<Integer> temp = new TreeSet<>();
        for(int element: nums) {
            temp.add(element);
        }
        int i = 0;
        for(int num : temp) {
            nums[i++] = num;
        }

        return nums;
    }
    public static void main(String ...args) {
        int [] arr = new int[]{1, 1, 0, 0, 0, 0, 2, 4, 5};
        RemoveDuplicatesBrute obj = new RemoveDuplicatesBrute();
        System.out.println(Arrays.toString((obj.removeDuplicates(arr))));
    }
}