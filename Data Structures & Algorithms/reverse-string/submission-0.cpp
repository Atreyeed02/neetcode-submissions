class Solution {
public:
    void reverseString(vector<char>& s) {
        
        int i=0,l=s.size()-1;
        if(i<l){
            swap(s[i++],s[l--]);
        }
    }
};