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

    private static int lowerBound(int [] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int res = n;
        while(low <= high) {
            int mid = (low+high)/2;
            if(nums[mid] >= target) {
                res = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return res;
    }

    private static int upperBound(int [] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int res = n;
        while(low <= high) {
            int mid = (low+high)/2;
            if(nums[mid] > target) {
                res = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return res;
    }

    public static int[] optimalOne(int[] nums, int target) {
        int lowerBound = lowerBound(nums, target);
        int upperBound = upperBound(nums, target)-1;
        if(lowerBound == nums.length || nums[lowerBound] != target)
            return new int []{-1, -1};

        else return new int []{lowerBound, upperBound};
    }

    public static void main(String ...args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(optimalOne(nums, target)));
    }
}
