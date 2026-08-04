class Solution {
    public int reverseBits(int n) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<32;i++){
            if((n &(1<<i))!=0){
                str.append("1");
            }else{
                str.append("0");
            }
        }
        int res=0;
        String reverse1= str.reverse().toString();
        for(int i=0;i<32;i++){
            if(reverse1.charAt(i)=='1'){
                res|=(1<<i);
            }
        }
        return res;
    }
}
