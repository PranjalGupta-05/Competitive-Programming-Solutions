#include<bits/stdc++.h>

using namespace std;
int main(){
    string name1, name2, mixed;
    cin>>name1>>name2>>mixed;
    string merged=name1+name2;
    sort(merged.begin(), merged.end());
    sort(mixed.begin(), mixed.end());
    if(merged==mixed){
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
    }
    return 0;
}