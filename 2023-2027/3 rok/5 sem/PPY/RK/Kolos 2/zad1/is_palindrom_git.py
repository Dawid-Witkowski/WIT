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
"""
poprzednia funkcja z niedozowlonym isalpha():
def is_palindrom(tekst, dlugosc):
    czysty = ''.join(c for c in tekst.lower() if c.isalpha()) #NIEWIEM CZY isalpha() MOŻNA UŻYWAĆ
    if dlugosc > len(czysty):
        return False
    return czysty[:dlugosc] == czysty[-dlugosc:][::-1]


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
print(is_palindrom('LajAl', 2))
"""
def is_palindrom(tekst, dlugosc):
    czysty = ''.join(c for c in tekst.lower() if 'a' <= c <= 'z')  # Zamiana isalpha()
    if dlugosc > len(czysty):
        return False
    return czysty[:dlugosc] == czysty[-dlugosc:][::-1]

print(is_palindrom('nurses run', 3))  # True
print(is_palindrom('Zakopane na pokaz', 3))  # True
print(is_palindrom('No i lezy batalion', 3))  # True
print(is_palindrom('No i lezy batalion', 5))  # False
print(is_palindrom('Ono winno', 2))  # True
print(is_palindrom('La111111111111111jAl1,', 2))  # True