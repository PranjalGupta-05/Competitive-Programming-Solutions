#include<iostream>

using namespace std;
int main(){
    int ques;
    int time;
    cin>>ques>>time;
    int leftTime=240-time;
    int count=0;
    for(int i=1;i<=ques;i++){
        leftTime-=5*i;
        if(leftTime>=0){
            count++;
        }
        else{
            break;
        }
    }
    cout<<count<<endl;
    return 0;
}