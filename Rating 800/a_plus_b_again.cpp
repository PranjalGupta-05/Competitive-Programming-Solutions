#include<iostream>

using namespace std;
int main(){
    int n;
    cin>>n;
    while(n>0){
        int num;
        cin>>num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        cout<<sum<<endl;
        n--;
    }
    return 0;
}