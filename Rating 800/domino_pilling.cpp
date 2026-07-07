#include<bits/stdc++.h>

using namespace std;
int main(){
    int r,w;
    cin>>r>>w;
    int mul=r*w;
    if(mul%2==0){
        cout<<mul/2<<endl;
    }
    else{
        cout<<(mul-1)/2<<endl;
    }
    return 0;
}