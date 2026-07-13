class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int flag=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]==nums[j]){
                    flag=1;
                    return true;
                    break;
                }
            }
           
        }
        if(!flag) return false;
    }
};
