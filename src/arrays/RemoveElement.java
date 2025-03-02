package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public int[] removeElement(int[] nums, int val) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int num: nums) {
            if(num != val) {
                temp.add(num);
            }
        }
        int i = 0;
        for(int num: temp) {
            nums[i] = num;
            i++;
        }
        return nums;
    }
    public static void main(String ...args) {
        int [] arr = new int[]{1, 1, 0, 0, 0, 0, 2, 4, 5};
        RemoveElement obj = new RemoveElement();
        System.out.println(Arrays.toString(obj.removeElement(arr, 0)));
    }
}
