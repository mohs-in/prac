package arrays;

import java.util.*;

public class ArraylistPractice {
    public static void main(String ...args) {
        List<Integer> nums = new ArrayList<>();

        // Task 1: Add elements to the array list
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.print("\nInitial List: ");
        for(int num : nums) {
            System.out.print(num+" ");
        }

        // Task 2: Remove Even numbers

        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i)%2 == 0) {
                nums.remove(i);
            }
        }

        System.out.print("\nList after removing the even numbers: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        // Task 3: Find the largest element
        int max = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num > max)
                max = num;
        }
        System.out.print("\nMax Element: "+max);

        // Task 4: Check if an Element Exists
        int key = 4; boolean found = false;
        for(int num: nums) {
            if(num == key) { found = true; break; }
        }
        if(found)
            System.out.println("\n"+true);
        else
            System.out.println("\n"+false);

        // Task 5: Merge Two ArrayLists
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(11);
        nums1.add(12);

        nums.addAll(nums1);
        System.out.print("After Merge: ");
        for(int num: nums) {
            System.out.print(num + " ");
        }

    }
}
