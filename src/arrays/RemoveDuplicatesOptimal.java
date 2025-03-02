package arrays;

import java.util.Arrays;

public class RemoveDuplicatesOptimal {
    public int[] removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return nums;
    }
    public static void main(String ...args) {
        int [] arr = new int[]{1, 1, 0, 0, 0, 0, 2, 4, 5};
        RemoveDuplicatesOptimal obj = new RemoveDuplicatesOptimal();
        System.out.println(Arrays.toString((obj.removeDuplicates(arr))));
    }
}

