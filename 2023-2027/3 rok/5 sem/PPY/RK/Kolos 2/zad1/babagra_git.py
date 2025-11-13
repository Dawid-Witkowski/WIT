"""
babagra

Napisz funkcję

babagra('<tekst>', <dlugosc>)

'<tekst>' - parametr wywołania w postaci tekstu (string)
<dlugosc> - parametr wywołania w postaci liczby całkowitej (int)
typ wyniku - boolean (True / False)

która będzie sprawdzała czy w tekście jest ukryty napis

Działanie funkcji:

1. Funkcja szuka w tekście sekwencji <dlugosc> liter, które są palindromem, czyli czytane od początku i od końca stanowią taki sam napis.
2. Wielkość liter (case) nie ma znaczenia
3. Znaki, które nie są literami (cyfry, spacje, przecinki, kropki, ...) należy pomijać (ignorować).

Przykład wywołania funkcji:

print(babagra('Kto zgubił klucze',5))
False

print(babagra('Gdzie są inni',4))
True

print(babagra('Zawsze są inni winni, tylko nie ja',9))
True

print(babagra('Zawsze są inni winni, tylko nie ja',4))
True

"""
def babagra(tekst, dlugosc):
    tekst = "".join([x for x in tekst.lower() if x in "abcdefghijklmnopqrstuvwxyz"]).lower()

    if dlugosc > len(tekst):
        return False
    
    matches = [tekst[::-1][len(tekst)-dlugosc-i:][:dlugosc] == tekst[i:i+dlugosc] for i in range(len(tekst)-dlugosc+1)]
    return True in matches


print(babagra('Kto zgubił klucze',5))
#False

print(babagra('Gdzie są inni',4))
#True

print(babagra('Zawsze są inni winni, tylko nie ja',9))
#True

print(babagra('Zawsze są inni winni, tylko nie ja',4))
#True
print(babagra('MadAm',5))
print(babagra('Agata',2))
print(babagra('Aa',2))