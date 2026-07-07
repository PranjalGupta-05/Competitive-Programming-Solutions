#include <iostream>

using namespace std;
int main() {
    int n;
    cin>>n;
    float sum=0;
    for(int i=0;i<n;i++) {
        int a;
        cin>>a;
        sum+=a;
    }
    float ans=sum/n;
    cout<<ans<<endl;
    return 0;
}