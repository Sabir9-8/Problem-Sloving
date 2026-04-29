#include <iostream>
#include <string>
using namespace std;

int main()
{
    int n; cin >> n;
    string s; cin >> s;
    int count = 0;
    int u = 0;
    int r = 0;
    int u_p = 0;
    int r_p = 0;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'U') u++;
        else if (s[i] == 'R') r++;
        if (i > 0 && s[i-1] != s[i]) {
            if (u == u_p) {
                
            }
            else if (r == r_p) {
                if (u > u_p && u > r_p) {}
            }
        }
    }
    cout << count;
    return 0;
}