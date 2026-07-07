#include<iostream>
#include<vector>

using namespace std;
int main(){
    int n, k;
    cin>>n>>k;
    vector<int> score;
    while(n>0){
        int p;
        cin>>p;
        score.push_back(p);
        n--;
    }
    int kth=score[k-1];
    int cnt=0;
    for(int i=0; i<score.size(); i++){
        if(score[i]>=kth && score[i]>0){
            cnt++;
        }
    }
    cout<<cnt<<endl;
    return 0;
}
