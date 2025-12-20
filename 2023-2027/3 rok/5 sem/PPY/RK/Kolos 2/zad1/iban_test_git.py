"""
iban_test

Napisz funkcję

iban_test('<tekst>')

<tekst> - parametr wywołania w postaci tekstu, przedstawiającego numer rachunku bankowego
typ wyniku funkcji - Boolean (True / False),

która będzie sprawdzała poprawność numeru rachunku bankowego, przekazanego w argumencie wywołania.

Algorytm:

- Rozpatrujemy konto o numerze IBAN PL83101010230000261395100000
- Numer polskiego banku MUSI posiadać 28 znaków.
- Po przeniesieniu 4 pierwszych znaków na koniec numeru uzyskujemy następujący ciąg znaków alfanumerycznych: 101010230000261395100000PL83. Następnie zamieniamy litery alfabetu na liczby dwucyfrowe: A=10, B=11, ..., Y=34, Z=35
- Zamieniamy litery na cyfry, uzyskujemy liczbę: 101010230000261395100000252183
- Wyliczamy resztę z dzielenia tej liczby przez 97. Reszta wynosi 1.
- Jeśli reszta z dzielenia wynosi 1 to numer IBAN jest prawidłowy (True), w przypadku przeciwnym - numer jest nieprawidłowy (False). Reszta z dzielenia wynosi 1, co oznacza, że suma kontrolna jest prawidłowa.

Przykład wywołania funkcji:

print ( iban_test ('PL83101010230000261395100000') )
True
print ( iban_test ('PL83101010230000261395123000') )
False
print ( iban_test ('PL831010102300002613951') )
False

UWAGA:
Sprawdzian dotyczy wiedzy i umiejętności uzyskanych wyłącznie w zakresie materiału przerabianego podczas ćwiczeń w Szkole. Zadanie musi być rozwiązane przy pomocy bazowego Pythona, bez importowania żadnych "ciekawych i użytecznych" bibliotek oraz stosowania "hakerskich sztuczek".

Wprowadź odpowiedź
"""
def iban_test(tekst):
    if len(tekst) == 28:
        #przeniesienie 4 pierwszych znaków na koniec
        tekst = tekst[4:] + tekst[:4]

        alfabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
        #zamiana liter na liczby w liście
        tekst_list = list(tekst[:24]) + [str(alfabet.index(l) + 10) if l in alfabet else l for l in tekst[24:26]] + list(tekst[26:])
        
        #zamiana całości na liczbę
        return (int(''.join(tekst_list))) % 97 == 1
    else:
        return False

print(iban_test('PL83101010230000261395100000'))
print(iban_test('PL83101010230000261395123000'))
print(iban_test('PL831010102300002613951'))
print(iban_test('BC03100000000000000000000000'))
print(iban_test('BC07100000008000090000000000'))
print(iban_test('GC59100000008000090000000000'))