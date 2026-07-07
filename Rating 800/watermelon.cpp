#include <iostream>

using namespace std;

int main() {
    // 1. Declare the variable for the input
    int w;
    
    // 2. Read from standard input
    cin >> w;
    
    // 3. Apply the logic and print to standard output
    if (w % 2 == 0 && w > 2) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
    
    return 0;
}