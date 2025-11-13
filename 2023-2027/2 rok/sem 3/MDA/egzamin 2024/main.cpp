#include <iostream>

using namespace std;

long long stirlinga(int n,int k)
{
    if(n==k) return 1;
    if(k>n || k==0 || n<=0) return 0;
    return stirlinga(n-1,k-1) + k*stirlinga(n-1,k);
}

long long podzial(int n,int k)
{
    if(n==k) return 1;
    if(n<=0 || n<k || k<=0) return 0;
    return podzial(n-1,k-1) + podzial(n-k,k);
}

long long potega(int n,int k)
{
    long long tmp = 1;
    for(int i=0;i<k;++i)
    {
        tmp *= n;
    }
    return tmp;
}

long long pot_ubywajaca(int n,int k)
{
    long long tmp = 1;
    for(int i=n;i>n-k;--i)
    {
        tmp *= i;
    }
    return tmp;
}

long long pot_przyrastajaca(int n,int k)
{
    long long tmp = 1;
    for(int i=n;i<n+k;++i)
    {
        tmp *= i;
    }
    return tmp;
}

long long silnia(int n)
{
    return pot_ubywajaca(n,n-1);
}

long long newton(int n,int k)
{
    return (silnia(n))/(silnia(k)*silnia(n-k));
}

long long bella(int n)
{
    long long tmp=0;
    for(int i=1;i<=n;++i) tmp += stirlinga(n,i);
    
    return tmp;
}

//wszystkie nieporzadki w permutacji o ilosci n
long long nieporzadki(int n)
{
    long long tmp=0;
    for(int i=0;i<=n;++i) tmp += potega(-1,i)*(silnia(n)/silnia(i));
    
    return tmp;
}

int main()
{
    int wybor = -1;
    int n,k;
    while(1)
    {
        cout << "Strirlinga drugiego rodzaju: 1\nPodzial: 2\nPotega ubywajaca: 3\nPotega przyrastajaca: 4\nNewton: 5\nPotega: 6\nSilnia: 7\nBella: 8\nNieporzadki w perm.: 9\nwybierz: ";
        cin >> wybor;
        
        cout << endl;
        switch(wybor)
        {
            case 1:
            cout << "Podaj n oraz k: ";
            cin >> n >> k;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (Stirlinga): " << stirlinga(n,k) << endl;
            break;
            case 2:
            cout << "Podaj n oraz k: ";
            cin >> n >> k;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (podzial): " << podzial(n,k) << endl;
            break;
            case 3:
            cout << "Podaj n oraz k: ";
            cin >> n >> k;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (pot. ubywajaca): " << pot_ubywajaca(n,k) << endl;
            break;
            case 4:
            cout << "Podaj n oraz k: ";
            cin >> n >> k;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (pot. przyrastajaca): " << pot_przyrastajaca(n,k) << endl;
            break;
            case 5:
            cout << "Podaj n oraz k: ";
            cin >> n >> k;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (newton): " << newton(n,k) << endl;
            break;
            case 6:
            cout << "Podaj n oraz k: ";
            cin >> n >> k;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (potega): " << potega(n,k) << endl;
            break;
            case 7:
            cout << "Podaj n: ";
            cin >> n;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (silnia): " << silnia(n) << endl;
            break;
            case 8:
            cout << "Podaj n: ";
            cin >> n;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (bella): " << bella(n) << endl;
            break;
            case 9:
            cout << "Podaj n: ";
            cin >> n;
            cout << "----------------------------------------------" << endl;
            cout << "Wynik (nieporzadki): " << nieporzadki(n) << endl;
            break;
            default:
            break;
        }
        cout << "----------------------------------------------" << endl;
    }
}
