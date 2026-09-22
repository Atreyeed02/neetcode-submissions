class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
        int i=0,j=n-k;
        if(k%2==0){
        while(j<n&&i<j-1){
            swap(nums[i],nums[j]);
            i++,j++;
        }
        }
       else {
        while(j<n&&i<j-1){
            swap(nums[i],nums[j]);
            i++,j++;
        }
        nums.push_back(nums[k-1]);
       }
        for(int j=0;j<n;j++){
            cout<<nums[j]<<" ";
        }
        
    }
};