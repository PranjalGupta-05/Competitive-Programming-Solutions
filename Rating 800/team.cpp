#include <iostream>

using namespace std;
int main(){
    int n;
    cin>>n;
    int cnt=0;
    while(n>0){
        int a,b,c;
        cin>>a>>b>>c;
        n--;
        if(a+b+c>=2){
            cnt++;
        }
    }
    cout<<cnt<<endl;
    return 0;
}