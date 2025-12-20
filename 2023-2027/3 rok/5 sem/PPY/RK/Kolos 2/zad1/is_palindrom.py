"""
**is_palindrom**

Napisz funkcję

`is_palindrom('tekst', dlugosc )`

- 'tekst' - parametr wywołania w postaci tekstu (string)
- 'dlugosc' - parametr wywołania w postaci liczby całkowitej (int)
- typ wyniku - boolean (True / False )

która będzie sprawdzała, czy w tekście jest ukryty napis

Działanie funkcji:
1. Palindrom jest napisem, który czytany w dowolnym kierunku, składa się z takiej samej sekwencji liter.
2. Funkcja **NIE SPRAWDZA** palindromu na całej długości tekstu 'tekst', ale ogranicza się do porównania jego fragmentu początkowego i końcowego, o długościach `dlugosc`.
3. UWAGA: Przed sprawdzeniem napisu należy pozostawić w nim tylko litery alfabetu.
4. Wielkość liter (CASE) jest ignorowana ('A' == 'a').

Przykład wywołania funkcji:

```python
print(is_palindrom('nurses run', 3))
# True
print(is_palindrom('Zakopane na pokaz', 3))
# True
print(is_palindrom('No i lezy batalion', 3))
# True
print(is_palindrom('No i lezy batalion', 5))
# False
print(is_palindrom('Ono winno', 2))
# True
```
"""
def is_palindrom(tekst, dlugosc):
    for znak in ['1','2','3','4','5','6','7','8','9','0',' ',',','.',';',':','?','!']:
        tekst = tekst.replace(znak,'')
    tekst = tekst.lower()

    if dlugosc > len(tekst):
        return False
    
    if tekst[len(tekst)-dlugosc:] == tekst[:dlugosc][::-1]:
        return True
    return False