#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main()
{
    int n; cin >> n;
    vector <string> str(n);
    for (int i = 0; i < n; i++) {
        cin >> str[i];
    }
    bool flag = false;
    int index = 0;
    for (int i = 0; i < n; i++) {
        if ((str[i][0] == 'O' && str[i][1] == 'O') || (str[i][3] == 'O' && str[i][4] == 'O')) {
            index = i;
            flag = true;
            cout << "Yes" << endl;
            break;
        }
    }
    if (flag) {
        for (int i = 0; i < n; i++) {
            if (i == index) {
                if (str[i][0] == 'O' && str[i][1] == 'O') {
                    str[i][0] = '+';
                    str[i][1] = '+';
                }
                else if (str[i][3] == 'O' && str[i][4] == 'O') {
                    str[i][3] = '+';
                    str[i][4] = '+';
                }
            }
            cout << str[i] << endl;
        }
    }
    else cout << "NO";
    return 0;
}