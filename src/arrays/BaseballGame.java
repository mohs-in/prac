package arrays;


import java.util.*;

public class BaseballGame {
    public static boolean isOperationInt(String operation) {
        try {
            Integer.parseInt(operation);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int calPoints(String[] operations) {
        List<Integer> nums = new ArrayList<>();

        for (String op : operations) {
            if (isOperationInt(op)) {
                nums.add(Integer.parseInt(op));
            } else if (op.equals("C")) {
                if (!nums.isEmpty()) nums.remove(nums.size() - 1);
            } else if (op.equals("D")) {
                if (!nums.isEmpty()) nums.add(nums.get(nums.size() - 1) * 2);
            } else if (op.equals("+")) {
                if (nums.size() >= 2) {
                    nums.add(nums.get(nums.size() - 1) + nums.get(nums.size() - 2));
                }
            }
        }

        int sum = 0;

        for(int num: nums)
            sum += num;

        return sum;
    }
    public static void main(String ...args) {
        String [] operations = {"5","2","C","D","+"};
        calPoints(operations);
    }
}