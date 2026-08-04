class Solution {
    public int[] countBits(int n) {
        int[] ar=new int[n+1];
        for(int x=1;x<=n;x++){
            for(int i=0;i<32;i++){
                if((x & (1<<i))!=0){
                    ar[x]++;
                }
            }
        }
        return ar;
    }
}
