#include <iostream>
using namespace std;

int main()
{
    int k, r;
    cin >> k >> r;
    int x = k;
    int i = 1;
    while (1) {
        if(k % 10 == 0) {
            break;
        }
        else if ((k - r) % 10 == 0) {
            break;
        }
        i++;
        k += x;
    }
    cout << i;
    return 0;
}