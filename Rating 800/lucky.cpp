#include<bits/stdc++.h>

using namespace std;
int main(){
    int n;
    cin>>n;
    while(n>0){
        string s;
        cin>>s;
        int sum_front=s[0]-'0'+s[1]-'0'+s[2]-'0';
        int sum_back=s[3]-'0'+s[4]-'0'+s[5]-'0';
        if(sum_front==sum_back){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
        n--;
    }
    return 0;
}