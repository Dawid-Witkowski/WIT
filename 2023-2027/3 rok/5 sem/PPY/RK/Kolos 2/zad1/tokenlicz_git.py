def tokenlicz(nazwa_pliku):
    # Otwórz plik i wczytaj zawartość
    with open(nazwa_pliku, 'r', encoding='utf-8') as plik:
        tekst = plik.read().lower()

    # Usuń znaki interpunkcyjne
    for znak in ['.', ',', ';', ':', '?', '!']:
        tekst = tekst.replace(znak, '')

    # Podziel tekst na wyrazy i zlicz wystąpienia dłuższych niż 4 znaki
    slownik = {wyraz: wyrazy.count(wyraz) for wyrazy in [tekst.split()] for wyraz in wyrazy if len(wyraz) > 4}

    # Usuń wyrazy, które występują mniej niż 3 razy
    return {wyraz: liczba for wyraz, liczba in slownik.items() if liczba > 2}

# Przykład użycia
print(tokenlicz('mruczanka.txt'))