# Pytanie 2 DziadekDzidek
# Napisz funkcję (45 punktów)
# dziadekDzidek('<tekst>')

# '<tekst>'          - parametr wywołania z planem drogi w postaci tekstu

# <psz>              parametr wywołania w postaci liczby

# typ wyniku funkcji     - boolean (True / False )


# Działanie funkcji:

#     Dziadek Dzidek wybrał się do lasu na grzyby. Babcia Dziunia dała mu plan drogi, żeby wrócił do domu.

#     Plan drogi jest tekstem, na który składają się:
#         wielkie litery, określające kierunek, w którym dziadek ma pójść:
#         'Z' - zawróć,
#         'L' - skręć w lewo o 90 stopni,
#         'P' - skręć w prawo o 90 stopni
#         liczby całkowite, określające liczbę kroków do wykonania

#     Znaki inne niż litery 'Z','L','P' oraz cyfry '0'..'9' mają być ignorowane.


def dziadekDzidek(tekst):
    droga = ''.join(x for x in tekst if x in 'ZLP0123456789').replace('Z', 'PP').replace('P', ',P,').replace('L', ',L,')
    droga = [x for x in droga.split(',') if x]
    pozycja_x = pozycja_y = kierunek = 0
    for komenda in droga:
        if komenda == 'L':
            kierunek += 90
        elif komenda == 'P':
            kierunek -= 90
        else:
            ruch = int(komenda)
            if kierunek % 360 == 0:
                pozycja_x += ruch
            elif kierunek % 360 == 90:
                pozycja_y += ruch
            elif kierunek % 360 == 180:
                pozycja_x -= ruch
            else:
                pozycja_y -= ruch
    return pozycja_x == 0 and pozycja_y == 0

print(dziadekDzidek('20P20P20P20')) # True
print(dziadekDzidek('20P20L20P20')) # False
print(dziadekDzidek('20Z20')) # True
print(dziadekDzidek('20Z10')) # False
print(dziadekDzidek('100Z20P10Z10P80')) # True
print(dziadekDzidek('1000000000000000000000000000000000Z1000000000000000000000000000000000')) # True
print(dziadekDzidek('100000000000000000dasdasd0000000000000000Z1000000000adsasdasd000000000000000000000000')) # True
print(dziadekDzidek('1000000000000000000000000000000000Z10000000000000000000000000000000001')) # False
print(dziadekDzidek('1000000000000sadasdad000000000000000000000Z1000000000000asdadad0000000000000000000001')) # False
print(dziadekDzidek('10LLLLL10L10L10')) # True
print(dziadekDzidek('10PPPPPPLLZ10')) # True
print(dziadekDzidek('20Z15L5Z5L5')) # True
