#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ll n;
    cin >> n;

    vector<ll> circulo(n);

    for (int i = 0; i < n; i++){
        cin >> circulo[i];
    }

    vector<ll> cont(2*n+1,0);

    for (int i = 0 ; i < n ; i++){
        cont [circulo[i]]++;
    }
    
    vector<ll> prefixSum((2*n)+1, 0);
    
    for (int i = 1; i <= 2*n; i++){
        prefixSum[i] = prefixSum[i-1] + circulo[i];
    }

    ll triangulos = 0;
    for (int i = 1; i <= 2*n; i++){
        int conta = prefixSum[i] - prefixSum[i-1];
        if(conta >= 3){
            triangulos += conta * (conta -1) * (conta -2) / 6;
        }
    }

    cout << triangulos << endl;
    return 0;
}//ptm no funciona :(