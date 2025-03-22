package arrays;

public class PlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i-1] == 0) && (i == len-1 || flowerbed[i+1] == 0)) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }
    public static void main(String ...args) {
        int [] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
