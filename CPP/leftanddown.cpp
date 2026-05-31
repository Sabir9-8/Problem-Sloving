#include <iostream>
#include <algorithm>

using namespace std;

long long gcd(long long a, long long b) {
    while (b) {
        a %= b;
        swap(a, b);
    }
    return a;
}

void solve() {
    long long a, b, k;
    cin >> a >> b >> k;
    long long g = gcd(a, b);
    long long m = max(a, b);
    long long req = (m + k - 1) / k;
    if (g >= req) {
        cout << 1 << "\n";
    } else {
        cout << 2 << "\n";
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    if (cin >> t) {
        while (t--) {
            solve();
        }
    }
    return 0;
}