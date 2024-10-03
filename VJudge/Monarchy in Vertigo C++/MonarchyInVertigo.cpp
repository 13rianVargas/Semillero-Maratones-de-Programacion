#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define vll vector<long long>
#define pb push_back //TODO: para?

vector <pair<vll,bool>> adj; //TODO: nombre adj?
vll die;
vll res;

ll D = 0;

void dfs(ll k){
    if(adj[k].second && k != 1) res.pb(k);
    do{
        adj[die[D]].second = false;
        res.pb(k);
        D++;

    }while (die[D] != k);
    if(adj[k].first.size() == 0) return;
    for(auto n : adj[k].first){ //TODO: auto?
        dfs(n);
    }
}

int main(){
    ll test;
    cin >> test;

    ll min =  1; //TODO: para?
    

    adj.resize(test+2); //TODO: para?

    for (ll i = 1; i <= test; i++){
         ll caso, index;
        cin >> caso >> index;


    }

        //TODO: Crear arbol.
        //TODO: Crear DFS recursivo.
        //TODO: Crear Array State, die(indice ultimo muerto), res.
        //TODO: Implementar nacimientos para congelar.
        //TODO: Registrar eventos muertes hasta que yo muera.
        //TODO: Cuando muere sigue la recursión para encontrar el siguiente rey.

    return 0;
}