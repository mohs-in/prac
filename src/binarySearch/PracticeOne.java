package binarySearch;


public class PracticeOne {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char result = letters[0];
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(letters[mid] > target) {
                result = letters[mid];
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return result;
    }
    public static void main(String ...args) {
        char[] letters = {'c','f','j'};
        char target = 'c';

        System.out.println(nextGreatestLetter(letters, target));

    }
}