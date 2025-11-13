"""
  dspam_confidence
  Przetwarza listę tekstów (napisów) z pliku, przekazanego w parametrze.
  typ wyniku funkcji FLOAT
która przetworzy listę tekstów (napisów) z pliku, przekazanego w parametrze.
Działanie funkcji:
1. Zadaniem funkcji jest przeglądanie sekwencyhne wierszy tekstu i wykrywanie w nich
  fragmentów, które rozpoczynają się od napisu "X-DSPAM-Confidence:"
2. Po znaku dwukropka ":" w tekście występują wartości parametrów - liczby typu FLOAT.
3. Wynikiem działania funkcji ma być średnia ze wszystkich wykrytych wartości parametrów

Przykład wywołania funkcji:
mejle.txt
X-DSPAM-Processed: Sat Jan 5 09:14:16 2008 ,X-DSPAM-Confidence: 0.8475
Author: stephen.marquard@uct.ac.za ,'New Revision: 39772
X-DSPAM-Processed: Fri Jan 4 18:10:48 2008 , X-DSPAM-Confidence: 0.6178
'X-DSPAM-Probability: 0.0000 , BSP-1415 New (Guest) user Notification,
From rjlowe@iupui.edu Fri Jan 4 15:46:24 2008 , X-DSPAM-Confidence: 0.6961

print(dspam_confidence('mejle.txt')
'0.720467'
"""
def dspam_confidence(file_name):
    # Otwieranie pliku i odczytanie wszystkich linii
    file = open(file_name, 'r')
    lines = file.readlines()
    file.close()

    # Inicjalizacja listy do przechowywania wartości confidence
    confidence_values = []

    # Użycie list comprehension do przetworzenia linii i wyodrębnienia wartości confidence
    confidence_values = [
        float(part.strip().split()[0])  # Konwersja na float
        for line in lines  # Przejście przez każdą linię
        if "X-DSPAM-Confidence:" in line  # Filtrowanie linii zawierających "X-DSPAM-Confidence:"
        for part in line.split("X-DSPAM-Confidence:")[1:]  # Przetwarzanie wszystkich wystąpień w linii
    ]

    # Obliczenie średniej i zwrócenie wyniku w jednym wyrażeniu
    return sum(confidence_values) / len(confidence_values) if confidence_values else 0.0

# Przykład wywołania funkcji
print(dspam_confidence('mejle.txt'))  # Wynik: 0.7204666666666667