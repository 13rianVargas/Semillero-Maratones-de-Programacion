#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    while(true){
        int n;
        cin >> n;
        if(n == 0) break;

        int arr[n];

        for (int i = 0; i < n; i++) cin >> arr[i];
        
        sort(arr, arr + n);

        for (int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }
        

        int rap1=arr[0];
        int rap2=arr[0];
        int len1=arr[0];
        int len2=arr[0];

        for (int i = 0; i < n; i++){
            
            if(arr[i]){
                
            }
        }
        
    }
    cout << endl;
    return 0;
}