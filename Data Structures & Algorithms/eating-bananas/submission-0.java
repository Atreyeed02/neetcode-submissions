public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        while(true){
            long total=0;
            for(int pile:piles){
                total+=(int)Math.ceil((double)pile/speed);
            }
            if(total<=h){
                return speed;
            }
            speed++;
        }
    }
}
