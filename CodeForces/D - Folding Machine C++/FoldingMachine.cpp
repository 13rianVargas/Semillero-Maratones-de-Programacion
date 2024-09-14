#include <bits/stdc++.h>
using namespace std;
#define ll long long



int main() {
    ll originalSize;
    cin >> originalSize;

    vector<ll> original(originalSize);
    for (int i = 0; i < originalSize; i++){
        cin >> original[i];
    }

    ll foldedSize;
    cin >> foldedSize;

    vector<ll> folded(foldedSize);
    for (int i = 0; i < foldedSize; i++){
        cin >> folded[i];
    }
    
    ll sizeDiff = originalSize - foldedSize;

    vector<ll> compa(foldedSize);
    for (int i = originalSize-1; i > sizeDiff; i--){
        original[i];//falta codigo
        
    }
    

    return 0;
}