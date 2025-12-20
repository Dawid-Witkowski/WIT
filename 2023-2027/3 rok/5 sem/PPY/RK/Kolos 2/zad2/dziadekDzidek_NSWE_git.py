"""
Napisz funkcję

dziadekDzidek('<trasa>')
'<trasa>' - parametr wywyołania, w postaci tekstu, zawierający plan drogi (zmiany kierunków i odległości przejścia)
dla dziadka Dzidka
typ wyniku funkcji - boolean (True / False)

Działanie funkcji:
1. Dziadek Dzidek wybrał się do lasu na grzyby. Babcia Dziunia dała mu plan drogi "Tam i z powrotem", żeby
wrócił do domu.
2. Trasa (plan drogi) jest tekstem, na który skłądają się:
 - Wielkie litery, określające kierunek marszu dziadka Dzidka:
 'N' - północ,
 'S' - południe,
 'W' - zachód,
 'E' - wschód.
 - liczby całkowite, określające liczbę kroków do przejścia w wybranym kierunku.
 - Należy przyjąć założenie, że parametr wywołania ma prawidłowy format i treść, oraz zawiera listę
 poleceń (więcej niż jedno)
3. Znaki inne niż wymienione w p.2 ('NSWE' i "0".."9") mają być ignorowane.
4. Sposób posługiwaniem się planem drogi:
 - Należy przyjąć, że dziadek porusza się na płaszczyźnie euklidesowej z układem współrzędnych (X,Y).
 - Współrzędne (X,Y) odpowiadają zwyczajowej róży kierunków geograficznych w następujący
 sposób: +X == 'E'; -X == 'W'; +Y == 'N'; -Y == 'S'
 - Współrzędne (x,y) są liczbami naturalnymi lub 0.
 - Współrzędne (x,y) wyznaczają odległości w kierunku danej osi (X,Y), od punktu centralnego
 przestrzeni (0,0).
 - W chwili początkowej, dziadek znajduje się w centralnym punkcie przestrzenie (0,0) i jest skierowany
 w górę osi +Y (na północ)
 - Dziadek może być skierowany jedynie wzdłóż osi +-X albo +-Y, czyli odpowiednio w kierunkach ich
 wartości rosnących, lub malejących. Inne, pośrednie kierunki skierowania dziadka są niemożliwe.
5. Funkcja w wyniku oddaje wartości:
   - `True`, jeśli po przejściu całej trasy dziadek Dzidek wrócił do punktu startowego `(0,0)`.
   - `False`, jeśli po zakończeniu trasy znajduje się w innym punkcie.

6. Przykłady:

   dziadekDzidek("10E5S10W5")  # ➝ True (dziadek wraca do (0,0))
   dziadekDzidek("10E5S8W5")   # ➝ False (dziadek kończy w (0,2))
   dziadekDzidek("3E3S3W3")    # ➝ True (zamknięta pętla)
   dziadekDzidek("10E5W5")     # ➝ False (dziadek kończy w (0,10))
"""
def dziadekDzidek(tekst):
    kierunki = ("E", "N", "W", "S")  # Krotka kierunków
    ruchy = ((1, 0), (0, 1), (-1, 0), (0, -1))  # Odpowiednie przesunięcia

    droga = ''.join(x for x in tekst if x in 'NSWE0123456789')
    for kierunek in kierunki:
        droga = droga.replace(kierunek, f',{kierunek},')

    droga = [x for x in droga.split(',') if x]
    pozycja_x = pozycja_y = 0
    kierunek_index = 1  # Początkowy kierunek to "N" (90 stopni)

    for komenda in droga:
        if komenda in kierunki:
            kierunek_index = kierunki.index(komenda)
        else:
            ruch = int(komenda)
            dx, dy = ruchy[kierunek_index]
            pozycja_x += dx * ruch
            pozycja_y += dy * ruch

    return pozycja_x == 0 and pozycja_y == 0