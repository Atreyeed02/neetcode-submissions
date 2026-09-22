class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
        int i=0,j=n-k;
        while(j<n&&i<j-1){
            swap(nums[i],nums[j]);
            i++,j++;
        }
       
        for(int j=0;j<n;j++){
            cout<<nums[j]<<" ";
        }
        
    }
};