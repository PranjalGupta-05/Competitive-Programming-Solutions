#include<bits/stdc++.h>

using namespace std;
int main(){
    string s;
    cin>>s;
    int cnt=1;
    int maxi=1;
    for(int i=0;i<s.length()-1;i++){
       if(s[i]==s[i+1]){
        cnt++;
        maxi=max(maxi,cnt);
       }
       else{
        cnt=1;
       }
    }
    if(maxi>=7){
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
    }
    return 0;
}