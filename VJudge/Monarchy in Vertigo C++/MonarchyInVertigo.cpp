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

/*/
    vector<bool> live(100001,true);
    vector<vll> adj;
    vector<bool> visited(100001,false);
    
    qll q;
    
    void dfs(ll k){
        if(visited[k])return;
        visited[k] = true;
        q.push(k);
        for(ll x : adj[k]){
            dfs(x);
        }
    }
    
    void solve() {
        ll n; cin >> n;
        
        vll die;
        ll min = 1;
        adj.resize(n+2);
        cf(i,1,n){
            ll s,n; cin >> s >> n;
            if(s == 1){
                adj[n].pb(++min);
            } else {
                die.pb(n);
            }
        }

        dfs(1);

        vll res;
        for(ll d : die){
            live[d] = false;
            while(!live[q.front()] && !q.empty()){
                q.pop();
            }
            res.pb(q.front());
        }
        
        for(ll num : res){
            cout << num << endl;
        }
    }
    
    int main() {
        ios_base::sync_with_stdio(false);
        cin.tie(0);
    
        ll t = 1;
        //cin >> t;
        while(t--)
            solve();
    
        return 0;
    }
//*/