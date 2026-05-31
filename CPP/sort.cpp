#include <iostream>
#include <algorithm>

int main() {
    int arr[] = {5, 2, 9, 1, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Sort in decreasing order
    std::sort(arr, arr + n, std::greater<int>());

    for (int i = 0; i < n; i++) {
        std::cout << arr[i] << " ";
    }
    return 0;
}
