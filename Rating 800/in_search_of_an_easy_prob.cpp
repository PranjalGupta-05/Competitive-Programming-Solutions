#include<iostream>

using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=1;i<=n;i++){
       int op;
       cin>>op;
       if(op==1){
           cout<<"HARD"<<endl;
           return 0;
       }
    }
    cout<<"EASY"<<endl;
    return 0;
}