#include <iostream>;
#include <unordered_map>
#include <vector>

using namespace std;

int main()
{
    map<int, int> dicc; //diccionario

    long long n, target;
    cin>>n>>target;

    long long arr[n];

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    unordered_map<int, int> pfSum;//prefix-sum
    long long currentSum = 0;
    long long count = 0;

    pfSum[0] = 1;

    for (int i = 0; i < n; ++i) {
        currentSum += arr[i];

        if (pfSum.find(currentSum - target) != pfSum.end()) {
            count += pfSum[currentSum - target];
        }

        pfSum[currentSum]++;
    }

    cout << count << endl;

    return 0;
}
