package binarySearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int n = nums.length;

        int low = 0, high = n-1;

        while(low <= high) {
            int mid = (int)((low+high)/2);
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
    public static void main(String ...args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}