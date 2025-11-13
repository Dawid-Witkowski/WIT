"""
Oscar_Directors_Summary

Napisz funkcję

generate_directors_summary('<nominations_file>', '<winners_file>', '<output_file>')

<nominations_file> - parametr wywołania w postaci tekstu, przedstawiającego ścieżkę do pliku z nominacjami do Oscara w kategorii najlepszy reżyser.
<winners_file> - parametr wywołania w postaci tekstu, przedstawiającego ścieżkę do pliku z laureatami Oscara w kategorii najlepszy reżyser.
<output_file> - parametr wywołania w postaci tekstu, przedstawiającego ścieżkę do pliku wyjściowego, który zostanie wygenerowany przez funkcję.
typ wyniku funkcji - None,

która na podstawie dwóch plików tekstowych (z nominacjami i zwycięzcami) wygeneruje plik tekstowy zawierający podsumowanie dla każdego reżysera w formacie:

"Reżyser", "Liczba nominacji", "Liczba Oscarów"

Algorytm:

1. Wczytaj plik z nominacjami i zbuduj słownik, w którym kluczem będzie nazwisko reżysera, a wartością liczba nominacji.
2. Wczytaj plik z zwycięzcami i zbuduj słownik, w którym kluczem będzie nazwisko reżysera, a wartością liczba Oscarów.
3. Połącz oba słowniki, aby uzyskać pełne podsumowanie dla każdego reżysera.
4. Zapisz wyniki do pliku wyjściowego w formacie CSV, gdzie każdy wiersz będzie zawierał nazwisko reżysera, liczbę nominacji i liczbę Oscarów.

Przykład wywołania funkcji:

generate_directors_summary('_OscarAwardForBestDirector_Nominations.txt', '_OscarAwardForBestDirector_Winners.txt', 'directors_summary.txt')

Przykładowa zawartość pliku wyjściowego (directors_summary.txt):

"Norman Taurog", 1, 1
"Frank Borzage", 1, 1
"Frank Lloyd", 2, 1
"Frank Capra", 3, 3
"John Ford", 2, 2
"Leo McCarey", 1, 1
"Victor Fleming", 1, 1
"Wesley Ruggles", 1, 0
"Clarence Brown", 1, 0
"Lewis Milestone", 1, 0
"Josef Von Sternberg", 2, 0
"King Vidor", 1, 0
"George Cukor", 1, 0
"Victor Schertzinger", 1, 0
"W. S. Van Dyke", 1, 0
"Michael Curtiz", 1, 0
"Henry Hathaway", 1, 0

UWAGA:
Sprawdzian dotyczy wiedzy i umiejętności uzyskanych wyłącznie w zakresie materiału przerabianego podczas ćwiczeń w Szkole. Zadanie musi być rozwiązane przy pomocy bazowego Pythona, bez importowania żadnych "ciekawych i użytecznych" bibliotek oraz stosowania "hakerskich sztuczek".
"""