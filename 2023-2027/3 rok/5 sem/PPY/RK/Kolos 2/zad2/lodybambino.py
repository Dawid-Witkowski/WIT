"""
lodybambino

Napisz funkcję

lodybambino(kwota,cena,patyki_na_bonus,bonus_za_spatyki)

- kwota - gotówka posiadana na zakupy lodów
- cena_loda - cena jednego loda
- promocja_za_patyki - liczba patyczków po lodach, potrzebnych do uzyskania promocji
- lody_w_promocji - liczba lodów otrzymywanych w ramach jednej promocji
- wynik - liczba całkowita otrzymanych lodów

1. Napisz funkcję, która wyznaczy liczbę otrzymanych lodów na podstawie wartości parametrów zakupów i promocji.
2. W celu uproszczenia obliczeń należy przyjąć, że wszystkie parametry są liczbami całkowitymi
3. Przykład wywołania funkcji i kalkulacji wyniku
lodybambino(15,2,3,1)
- Parametry wywołania:
  - kwota = 15
  - cena_loda = 2
  - promocja_za_patyki = 3
  - lody_w_promocji = 1
- Za kwotę 15 złotych można kupić 7 lodów po 2 złote i pozostanie 1 złoty w zapasie
- Za 7 patyków po lodach można uzyskać 2 lody w promocji (jedna promocja za 3 patyki i jedna za 3 patyki)
- Za 2 lody w promocji można uzyskać 1 loda (1 lód za każdą promocję)
- Za 1 loda w promocji można uzyskać jeszcze 1 loda (1 lód za każdą promocję)
- SUMA = 7 + 2 + 1 = 10

UWAGA: Sprawdzian dotyczy wiedzy i umiejętności uzyskanych wyłącznie w zakresie materiału przerabianego podczas zajęć w Szkole. Zadanie musi być rozwiązane wyłącznie przy pomocy bazowego Pythona, bez importowania żadnych "ciekawych i użytecznych" bibliotek oraz stosowania "hackerskich sztuczek".

"""
def lodybambino(kwota, cena, patyki_na_bonus, bonus_za_spatyki):
    # Obliczenie liczby lodów, które można kupić za posiadaną kwotę
    liczba_lodow = kwota // cena
    patyki = liczba_lodow  # Każdy lód daje 1 patyk

    # Pętla do przeliczania patyczków na kolejne lody
    while patyki >= patyki_na_bonus:
        nowe_lody = patyki // patyki_na_bonus * bonus_za_spatyki
        patyki = (patyki % patyki_na_bonus) + nowe_lody
        liczba_lodow += nowe_lody

    return liczba_lodow