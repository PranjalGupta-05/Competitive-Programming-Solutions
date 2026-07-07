#include<iostream>
#include<vector>

using namespace std;
int main(){
    int n;
    cin>>n;
    int val;
    cin>>val;
    int cnt=0;
    // vector<int> ans;
    // for(int i=1;i<=n;i++){
    //     if(i%2!=0){
    //         ans.push_back(i);
    //     }
    // }
    // for(int i=1;i<=n;i++){
    //     if(i%2==0){
    //         ans.push_back(i);
    //     }
    // }
    // cout<<ans[val-1]<<endl;
    // return 0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            cnt++;
            if(cnt==val){
                cout<<i<<endl;
                return 0;
            }
        }
    }
    return 0;
}