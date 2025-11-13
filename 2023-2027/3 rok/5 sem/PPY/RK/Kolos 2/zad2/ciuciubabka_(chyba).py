"""
**Zadanie: Ciuciubabka (45 punktów)**

Napisz funkcję `ciuciubabka('<nazwa_pliku>')`, która przetworzy listę poleceń ruchu z pliku tekstowego przekazanego w parametrze. Funkcja powinna
zwrócić odległość końcową od punktu startowego, liczona w normie Manhattan (L1 norm).

**Parametry wejściowe:**
- `<nazwa_pliku>` – nazwa pliku tekstowego zawierającego listę poleceń ruchu, po jednym w każdej linii.

**Format poleceń w pliku:**
Każda linia pliku zawiera dwa elementy oddzielone spacją:
1. **kierunek** – jeden z czterech możliwych: `przód`, `tył`, `prawo`, `lewo`.
2. **kroki** – liczba całkowita określająca liczbę kroków w danym kierunku.

**Działanie funkcji:**
1. Startujemy z punktu (0, 0).
2. Przetwarzaj polecenia po kolei, modyfikując współrzędne w zależności od kierunku:
   - `przód` zwiększa współrzędną **y** o podaną liczbę kroków,
   - `tył` zmniejsza współrzędną **y** o podaną liczbę kroków,
   - `prawo` zwiększa współrzędną **x** o podaną liczbę kroków,
   - `lewo` zmniejsza współrzędną **x** o podaną liczbę kroków.
3. Po przetworzeniu wszystkich poleceń oblicz odległość od punktu początkowego (0, 0) do punktu końcowego (x, y) według wzoru na normę Manhattan:
   \[
   L1\_norm = |0 - x| + |0 - y|
   \]
4. Zwróć wynik jako liczbę całkowitą.

**Przykład 1:**

Plik `polecenia1.txt`:
```
przód 2
prawo 3
```

Wywołanie:
```python
print(ciuciubabka('polecenia1.txt'))
```

Wynik:
```
5
```
*(Ruchy: +2 w górę i +3 w prawo → końcowe współrzędne (3, 2), odległość: |0 - 3| + |0 - 2| = 5)*

---

**Przykład 2:**

Plik `polecenia2.txt`:
```
przód 2
lewo 3
przód 2
lewo 2
tył 1
```

Wywołanie:
```python
print(ciuciubabka('polecenia2.txt'))
```

Wynik:
```
8
```
*(Ruchy: +2 w górę, -3 w lewo, +2 w górę, -2 w lewo, -1 w dół → końcowe współrzędne (-5, 3), odległość: |0 - (-5)| + |0 - 3| = 5 + 3 = 8)*
"""

def ciuciubabka(nazwa_pliku):
    # Mapowanie kierunków na zmiany współrzędnych
    ruchy = {
        'przód': (0, 1),
        'tył': (0, -1),
        'prawo': (1, 0),
        'lewo': (-1, 0)
    }

    # Wczytywanie pliku i przetwarzanie poleceń
    plik = open(nazwa_pliku, 'r')
    polecenia = [linia.strip().split() for linia in plik.readlines()]
    plik.close()

    # Obliczanie końcowej pozycji
    x, y = sum([ruchy[kierunek][0] * int(kroki) for kierunek, kroki in polecenia]), \
           sum([ruchy[kierunek][1] * int(kroki) for kierunek, kroki in polecenia])

    # Obliczanie odległości Manhattan
    return abs(x) + abs(y)
print(ciuciubabka('test.txt'))