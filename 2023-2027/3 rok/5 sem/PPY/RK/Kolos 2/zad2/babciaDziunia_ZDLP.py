"""
**babciaDziunia**  

Napisz funkcję  
**babciaDziunia("tekst")**  

- `"tekst"` – parametr wywołania w postaci tekstu zawierającego listę lokalizacji grzybów w lesie  
Typ wyniku funkcji – `"tekst"` z planem drogi po grzyby dla dziadka  

### Działanie funkcji:  

1. Babcia Dziunia postanowiła przygotować plan drogi na grzyby dla dziadka Dziadka.  
2. Parametrem wywołania funkcji jest `"tekst"` (STRING).  
   - Zawiera listę współrzędnych (x,y) na przykład `"(3,5)(12,8)(4,-20)"`.  
   - Współrzędne (x,y) reprezentują lokalizację grzybów w lesie, w układzie kartezjańskim płaszczyzny
   euklidesowej (X,Y).  
   - Współrzędne są liczbami naturalnymi lub 0.  
   - Współrzędne (x,y) wyznaczają liczbę kroków w kierunku danej osi (X,Y), od punktu centralnego
   przestrzeni: (0,0)
   - Należy przyjąć założenie, że parametr wywołania ma prawidłowy format i treść, oraz zawiera
   więcej niż jedną lokalizację grzyba (lista tupli).
3. Funkcja w wyniku daje `"tekst"` zawierający plan drogi (zmiany kierunków i odległości przejścia) dla 
   dziadka Dzidka, który ma pozbierać grzyby.  
4. W chwili wywołania funkcji:  
   - Dziadek znajduje się w punkcie przestrzenie `(0,0)`.  
   - Dziadek jest skierowany w górę osi +Y 
   - Proponuje się najpierw wyznaczać przemieszczenia wzdłuż osi +-Y, a dopiero po tym, wyznaczać
   przemieszczenia wzdłuż osi +-X.  
   - Przejście dziadka przez punkt lokalizacji grzyba (x,y) jest równoznaczne z jego zabraniem.

5. Dziadek może być skierowany jedynie wzdłuż osi +-X albo +-Y, czyli odpowiednio w kierunkach ich wartości 
rosnących, lub malejących. Inne, pośrednie kierunki skierowania dziadka są niemożliwe.

6. Na tekst z planem drogi składają się:
Wielkie litery, określające kolejny zwrot kierunku marszu dziadka Dzidka:
   - 'Z' - "w tył zwrot" - obrót o 180 stopni;
   - 'D' - idź dalej w tym kierunku;
   - 'L' - "w lewo zwrot" - obrót w lewo o 90 stopni;
   - 'P' - "w prawo zwrot" - obrót w prawo o 90 stopni.
Liczby naturalne, określające liczbę kroków do przejścia w aktualnym kierunku

7. Przykładowa lista lokalizacji grzybów '(0,4),(12,4),(7,4)' powinna wygenerować tekst 
z listą poleceń dla dziadka: "4P12Z5":
   - liczba "4" (kroki przed siebie), spowoduje, że znajdzie się w punkcie przestrzeni (0,4)
   - Zwrot: "P" (zwrot w prawo), spowoduje, że będzie nadal stał w punkcie (0,4), ale skierowany w górę
   osi X.
   - liczba "12" (kroków przed siebie), spowoduje, że znajdzie się w punkcie przestrzeni (12,4).
   - Zwrot "Z" (zawróć), spowoduje, że będzie nadal stał w punkcie (12,4), ale skierowany w dół osi X.
   - liczba: "5" (kroków przed siebie), spowoduje, że znajdzie się w punkcie przestrzeni (7,4)

**Przykłady wywołania funkcji (tylko kilka możliwych):**  
```  
print(babciaDziunia('(0,4),(12,4),(7,4)'))  
'4P12Z5'  

print(babciaDziunia('(0,5),(2,5),(3,8)'))  
'5P2L3P1' 

print(babciaDziunia('(2,3),(2,7),(3,7)'))  
'3P2L4P1' 
```
"""

def babciaDziunia(tekst):
    parts = [tuple(map(int, p.split(','))) for p in tekst.strip('()').split('),(')]
    kierunki = {0: 'D', 180: 'Z', 90: 'P', 270: 'L'}
    kierunek, x, y, plan = 0, 0, 0, []
    for x2, y2 in parts:
        if y2 != y:
            nowy = 0 if y2 > y else 180
            plan.append((kierunki[(nowy - kierunek) % 360], (y2 - y) if y2 > y else (y - y2)))
            kierunek = nowy
        if x2 != x:
            nowy = 90 if x2 > x else 270
            plan.append((kierunki[(nowy - kierunek) % 360], (x2 - x) if x2 > x else (x - x2)))
            kierunek = nowy
        x, y = x2, y2
    mapa = ''.join(map(str, sum(plan, ())))
    return mapa[1:] if mapa[0] == 'D' else mapa