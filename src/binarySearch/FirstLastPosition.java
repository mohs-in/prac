package binarySearch;

import java.util.*;

public class FirstLastPosition {
    public static int[] brute(int[] nums, int target) {
        int[] result = {-1, -1};
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                if(result[0] == -1) result[0] = i;
                result[1] = i;
            }
        }
        return result;
    }

    public static void main(String ...args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(brute(nums, target)));
    }
}
