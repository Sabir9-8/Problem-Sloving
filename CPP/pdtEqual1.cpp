#include <vector>
#include <iostream>
using namespace std;

int main()
{
    int n; cin >> n;
    vector <int> v(n);
    int neg_c = 0;
    int pos_c = 0;
    int zero = 0;
    long long neg_sum = 0;
    long long pos_sum = 0;
    long long count = 0;
    for (int i = 0; i < n; i++) {
        cin >> v[i];
        if (v[i] > 0) {
            pos_c++;
            pos_sum += v[i];
        }
        else if (v[i] < 0) {
            neg_c++;
            neg_sum += v[i];
        }
        else zero++;
    }
    count = -neg_sum - neg_c + pos_sum - pos_c;
    if (neg_c % 2 == 0 || zero != 0) count += zero;
    else count += 2;
    cout << count;

    return 0;
}