#include <string>
#include <iostream>
using namespace std;

int main()
{
    string s; cin >> s;
    int n = s.length();
    int count = 0;
    char ch = 'a';
    for (int i = 0; i < n; i++) {
        int temp = abs(ch - s[i]);
        if (temp >= 13) {
            count = count + (26-temp);
        }
        else count += temp;
        ch = s[i];
    }
    cout << count;
    return 0;
}