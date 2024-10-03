#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ll m,n;
    cin>>m>>n;

    ll size = m*n;

    ll dominos;

    if (size %2==0){
    dominos = size/2;
    }
    if (size %2!=0){
    dominos = round((size/2));
    }

    cout<<dominos<<endl;

    return 0;
}