#include<bits/stdc++.h>

using namespace std;
int main(){
    string s;
    cin>>s;
    string ans="";
    int n=s.length();
    for(int i=0;i<n;i++){
        string temp="";
        temp.push_back(s[i]);
        if(temp=="."){
            ans.push_back('0');
            temp="";
        }
        else if(temp=="-"){
            if(i+1<n){
                temp.push_back(s[i+1]);
                if(temp=="-."){
                    ans.push_back('1');
                    i++;
                    temp="";
                }
                else if(temp=="--"){
                    ans.push_back('2');
                    i++;
                    temp="";
                }
            }
        }
    }
    cout<<ans<<endl;
    return 0;
}