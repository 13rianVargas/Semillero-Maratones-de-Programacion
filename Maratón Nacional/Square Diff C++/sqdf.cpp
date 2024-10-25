#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    while(true){
        int n;
        cin >> n;
        if(n==0) break;
        if(n%4 == 0 || n%2==1){
            cout << "Y" << endl;
        }else cout << "N" << endl;
    }
    return 0;
}