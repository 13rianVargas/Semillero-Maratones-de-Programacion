#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    ll n, k;
    cin >> n;
    cin >> k;
    
    vector<ll> array(n);
    for (int i = 0; i < n; i++) {
        cin >> array[i];
    }
    
    ll next = array[k-1];
    ll cont = 0;

    for (int i = 0; i < n; i++) {
        if (array[i] > 0 && array[i] >= next){
            cont++;
        }
    }

    cout << cont <<  endl;

    return 0;
}