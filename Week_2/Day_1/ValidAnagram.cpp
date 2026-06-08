class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size()){
            return false;
        }
        else{
        int f[26]={0};
        int c1;
        int c2;
        for(int i=0;i<s.size();i++){
            c1=s[i]-'a';
            f[c1]++;
        }
        for(int j=0;j<t.size();j++){
            c2=t[j]-'a';
            f[c2]--;
        }
        for(int k=0;k<26;k++)
        {
            if(f[k]!=0){
                return false;
            }
        }
        return true;  
        }
     
    }
};
