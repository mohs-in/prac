package arrays;

import java.util.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }

        while(i < m) {
            result.add(nums1[i]);
            i++;
        }

        while(j < n) {
            result.add(nums2[j]);
            j++;
        }

        for(int k = 0; k < result.size(); k++) {
            nums1[k] = result.get(k);
        }
    }

    public static void main(String ...args) {
        int m = 3, n = 3;
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}