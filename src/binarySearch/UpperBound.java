package binarySearch;

import java.util.Arrays;

public class UpperBound {
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

    public static void main(String ...args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(upperBound(nums, target));
    }
}
