#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n;
    cin>>n;
    long long x[n];
    for (int i = 0; i < n; i++){
        cin>>x[i];
    }
    
    long long sum = x[0];
    long long max = x[0];
    
    for (int i = 1; i < n; i++){
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