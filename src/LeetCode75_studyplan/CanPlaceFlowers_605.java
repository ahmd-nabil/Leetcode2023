package LeetCode75_studyplan;

/**
 * @author Ahmed Nabil
 */
public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0 || flowerbed[i-1] == 0);
                boolean emptyRight = (i == flowerbed.length-1 || flowerbed[i+1] == 0);
                if(emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <=0 ;
    }
}
