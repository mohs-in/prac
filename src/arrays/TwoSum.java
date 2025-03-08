package arrays;

import java.util.*;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] res = new int[2];
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if((nums[i]+nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String ...args) {
        int [] nums = {1, 6, 2, 10, 3};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}