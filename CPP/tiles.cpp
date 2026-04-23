#include <vector>
#include <iostream>
using namespace std;
bool checkNextOne(int i, j) {
    if (sq[i][j] == '.') return true;
    else return false;
}

bool checkNextThree(int i, int j) {
    if (sq[i][j-1] == '.' && sq[i][j] == '.' && sq[i][j+1]) {
        bool nextOne = checkNextOne(i+1, j);
        return nextOne;
    }
    else return false;
}

int main()
{
    int n; cin >> n;
    vector<string> sq(n);
    for (int i = 0; i < n; i++) {
        cin >> sq[i];
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (sq[i][j] == '.') {
                bool next = checkNextThree(i+1, j);
                if (!next) {
                    cout << "NO";
                }
                else {
                    continue;
                }
            }
        }
    }

    return 0;
}