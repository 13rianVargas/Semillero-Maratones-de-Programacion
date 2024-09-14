#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll minDistancia(const vector<ll>& distances, ll C, ll T1, ll T2) {
    int N = distances.size();
    vector<ll> arrayCircular(2 * N);

    for (int i = 0; i < N; ++i) {
        arrayCircular[i] = distances[i];
        arrayCircular[N + i] = distances[i] + C;
    }

    ll minDistancia = C+1;

    for (int i = 0; i < N; ++i) {
        ll distanciaTotal = 0;
        ll ultimoParche = arrayCircular[i] + T1;
        bool usarParche1 = true;

        for (int j = i; j < i + N; j++) {
            if (arrayCircular[j] > ultimoParche) {
                distanciaTotal += (usarParche1 ? T1 : T2);
                ultimoParche = arrayCircular[j] + (usarParche1 ? T1 : T2);
                usarParche1 = !usarParche1;
            }
        }

        distanciaTotal += (usarParche1 ? T1 : T2);
        minDistancia = min(minDistancia, distanciaTotal);
    }

    return minDistancia;
}

int main() {
    ll holes, circunferencia, parche1, parche2;
    cin >> holes >> circunferencia >> parche1 >> parche2;

    vector<ll> distancias(holes);
    for (int i = 0 ; i < holes; i++) {
        cin >> distancias[i];
    }

    sort(distancias.begin(), distancias.end());

    ll result1 = minDistancia(distancias, circunferencia, parche1, parche2);
    ll result2 = minDistancia(distancias, circunferencia, parche2, parche1);

    ll result = min(result1, result2);
    cout << result << endl;
    return 0;
}
