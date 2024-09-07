#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    
    ll size;
    cin >> size;

    ll target;
    cin >> target;
    
    vector <ll> array(size);

    for(ll i = 0; i < size; i++) {
        cin >> array[i];
    }
    
    vector <ll> prefixSum(size);

    prefixSum[0] = array[0];
    map<ll,ll> dicc;

    for (ll i = 1; i < size; i++)
    {
        prefixSum[i] = array[i] + prefixSum[i-1];
        if (dicc.find(prefixSum[i]) == dicc.end()) {
        dicc[i] = prefixSum[i];
        }
    }

    cout<<target<<endl;

    return 0;
}
