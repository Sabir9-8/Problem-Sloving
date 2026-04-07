#include <iostream>
#include <algorithm>

using namespace std;
int main()
{
    int k2, k3, k5, k6;
    cin >> k2 >> k3 >> k5 >> k6;
    int x = min({k2, k5, k6});
    k2 -= x; k5 -= x; k6 -= x;
    int y = min(k2, k3);
    
    int sum = x*256 + y*32;
    cout << sum;
    return 0;
}