#include<iostream>

using namespace std;
int main(){
    int n;
    cin>>n;
    while(n>0){
        int cnt=0;
        int a,b,c,d;
        cin>>a>>b>>c>>d;
        if(a<b){
            cnt++;
        }
        if(a<c){
            cnt++;
        }
        if(a<d){
            cnt++;
        }
        cout<<cnt<<endl;
        n--;
    }
    return 0;
}