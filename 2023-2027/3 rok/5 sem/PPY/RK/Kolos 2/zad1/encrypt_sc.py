"""
encrypt_sc
Działanie funkcji:
1. Zamiana wielkich liter alfabetu łacińskiego {'A',...,'Z'} z parametru wywołania '<tekst>',
<psz> + numer danej litery w napisie <tekst>
pozycji do przodu, cyklicznie w łańcuchu znaków.
Wartość numeru pierwszej litery w napisie <tekst> = 0.
Numerowane są tylko wielkie litery alfabetu łacińskiego {'A', ..., 'Z'}, pomijanie
innych znaków, napotkanych w parametrze <tekst> nie zmienia numeru kolejnej litery.

2. Pozostałe znaki tekstu źródłowego nie podlegają zamianom.

Przykłady wywołania funkcji:

print(encrypt_sc('AAA',3))
DEF

print(encrypt_sc('123A,A-A+dzidek',3))
123D,E-F+dzidek

print(encrypt_sc('8 AAA',4))
8 EFG

print(encrypt_sc('8 PRZECIWNIKOW',4))
8 TWFLKRGYUXCL
"""
def encrypt_sc(tekst, psz):
    alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    indeks = 0
    wynik = []
    
    for litera in tekst:
        if litera in alfabet:
            wynik.append(alfabet[(alfabet.index(litera) + indeks + psz) % 26])
            indeks += 1
        else:
            wynik.append(litera)
    
    return "".join(wynik)

# Przykłady użycia:
print(encrypt_sc('AAA', 3))  # DEF
print(encrypt_sc('123A,A-A+dzidek', 3))  # 123D,E-F+dzidek
print(encrypt_sc('8 AAA', 4))  # 8 EFG
print(encrypt_sc('8 PRZECIWNIKOW', 4))  # 8 TWFLKRGYUXCL
