def magicnumber(liczba):
    # Konwertujemy liczbę na string, aby móc iterować po jej cyfrach
    liczba_str = str(liczba)
    # Obliczamy liczbę cyfr
    liczba_cyfr = len(liczba_str)
    # Obliczamy sumę cyfr podniesionych do potęgi równej liczbie cyfr
    suma = 0
    for cyfra in liczba_str:
        suma += int(cyfra) ** liczba_cyfr
    # Porównujemy wynik z pierwotną liczbą
    return suma == liczba