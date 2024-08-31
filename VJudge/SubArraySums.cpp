#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    
    ll num;
    cin >> num;

    const ll size = num;

    ll target;
    cin >> target;
    
    vector <ll> array(num);

    for(ll i = 0; i < num; i++) {
        cin >> array[i];
    }
    
    ll prefixSum[size];//TODO: check the path of clang ¬¬

    prefixSum[0] = array[0];
    for (ll i = 0; i < num; i++)
    {
        /* code */
    }
    
    

    cout<<target<<endl;

    return 0;
}