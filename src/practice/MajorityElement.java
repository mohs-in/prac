package practice;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int result=0;
        for (int num: nums) {
            if (!mp.containsKey(num))
                mp.put(num, 1);
            else
                mp.put(num, mp.get(num)+1);
            if (mp.get(num)>nums.length/2) {
                result = num;
                break;
            }
        }
        return result;
    }
    public static void main(String ...args) {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}