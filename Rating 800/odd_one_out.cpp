#include<bits/stdc++.h>

using namespace std;
int main(){
    int n;
    cin>>n;
    while(n>0){
        int a,b,c;
        cin>>a>>b>>c;
        int ans=a^b^c;
        cout<<ans<<endl;
        n--;
    }
    return 0;
}