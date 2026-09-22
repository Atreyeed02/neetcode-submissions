#include<bits/stdc++.h>
using namespace std;
int main(){
    bool Palin(string s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
        
        while (left < right && !isalnum(s[left])) left++;
       
        while (left < right && !isalnum(s[right])) right--;

       
        if (tolower(s[left]) != tolower(s[right]))
            return false;

        left++;
        right--;
    }
    return true;
}

int main() {
    string s;
    cout << "Enter a string: ";
    getline(cin, s);

    if (isPalindrome(s))
        cout << "true" << endl;
    else
        cout << "false" << endl;

    return 0;
}

}