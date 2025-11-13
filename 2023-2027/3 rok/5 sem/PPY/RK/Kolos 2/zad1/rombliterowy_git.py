def rombliterowy(poziom):
    alfabet = "abcdefghijklmnopqrstuvwxyz"

    # Ograniczenie poziomu do zakresu 1-26 bez użycia min/max
    if poziom < 1:
        poziom = 1
    elif poziom > 26:
        poziom = 26
    szerokosc = 4 * poziom - 3  # Szerokość każdego wiersza

    for wiersz in range(2 * poziom - 1):
        litera_start = min(wiersz, (2 * poziom - 2) - wiersz)

        # Tworzenie listy liter za pomocą list comprehension
        litery = [alfabet[poziom - i - 1] for i in range(litera_start + 1)]

        # Tworzenie środkowej części wiersza
        środek = "-".join(litery + litery[-2::-1])

        # Obliczanie myślników po bokach
        myślniki = "-" * ((szerokosc - len(środek)) // 2)

        print(myślniki + środek + myślniki)