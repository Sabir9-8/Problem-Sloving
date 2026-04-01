#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q;
    cin >> n >> q;
    vector <int> v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }
    int l, r;
    while (q--) {
        cin >> l >> r;
        long long sum = 0;
        for (int i = l; i <= r; i++) {
            sum += v[i];
        }
        cout << sum << endl;
    }
    return 0;
}
