package binarySearch;

public class sqrtOfX {
    public static int brute(int x) {
        int result = 0;
        for(int i = 1; i <= x/i; i++) {
            result = i;
        }
        return result;
    }

    public static int optimal(int x) {
        if(x == 0)  return 0;
        int low = 1, high = x;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(mid <= x/mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    public static void main(String ...args) {
        int x = 4;
        System.out.println(optimal(x));
    }
}
