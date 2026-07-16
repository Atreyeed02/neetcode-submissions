public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;
        while(left < right){
            int speed = left + (right - left) / 2;
            long total=0;
            for(int pile:piles){
                total+=(pile + speed - 1L) / speed;
            }
            if(total<=h){
                right = speed;
            } else {
                left = speed + 1;
            }
        }
        return left;
    }
}