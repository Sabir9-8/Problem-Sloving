#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main()
{
    int n; cin >> n;
    string s; cin >> s;
    vector<int> ans;
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'B') {
            count++;
        }
        else {
            if (count != 0) {
                ans.push_back(count);
            }
            count = 0;
        }
    }
    if (count != 0) {
        ans.push_back(count);
    }
    int l = ans.size();
    cout << l << endl;
    for (int i = 0; i < l; i++) {
        cout << ans[i] << " ";
    }
    return 0;
}