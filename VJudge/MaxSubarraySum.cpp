#include <bits/stdc++.h>

using namespace std;

#define ll long long

int main(){
    
    ll num;
    cin >> num;
    
    vector <ll> x(num);

    for (int i = 0; i < num; i++){
        cin>>x[i];
    }
    
    ll sum = x[0];
    ll max = x[0];
    
    for (int i = 1; i < num; i++){
        sum += x[i];
        if (x[i] > sum){
            sum = x[i];
        }
        if (sum > max){
            max = sum;
        }
    }

    cout<<max<<endl;

    return 0;
}