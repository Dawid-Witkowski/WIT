def babciaDziunia(tekst):
    parts = [tuple(map(int, p.split(','))) for p in tekst.strip('()').split('),(')]
    kierunek, x, y, plan = 'N', 0, 0, []
    
    # Dodaj wszystkie ruchy do planu
    for x2, y2 in parts:
        if y2 != y:
            nowy = 'N' if y2 > y else 'S'
            plan.append((nowy, abs(y2 - y)))
            kierunek = nowy
        if x2 != x:
            nowy = 'E' if x2 > x else 'W'
            plan.append((nowy, abs(x2 - x)))
            kierunek = nowy
        x, y = x2, y2
    
    # Przejdź przez plan i zamień powtarzające się kierunki na 'D'
    kierunek = 'N'  # Dziadek zaczyna skierowany na północ
    for i in range(len(plan)):
        kierunek, plan[i] = (kierunek, ('D', plan[i][1])) if plan[i][0] == kierunek else (plan[i][0], plan[i])
    
    mapa = ''.join([f"{k}{s}" for k, s in plan])
    return mapa[1:] if mapa[0] == 'D' else mapa

# Przykłady wywołania funkcji
print(babciaDziunia('(0,4),(12,4),(7,4)'))  # '4E12W5'
print(babciaDziunia('(0,5),(2,5),(3,8)'))   # '5E2N3E1'
print(babciaDziunia('(2,3),(2,7),(3,7)'))   # '3E2N4E1'
print(babciaDziunia('(2,3),(3,3),(3,7)'))   # '3E2D1N4'
print(babciaDziunia('(2,3),(3,3),(4,3)'))   # '3E2D1D1'
print(babciaDziunia('(2,3),(3,3),(4,3),(4,4),(4,6),(0,0)'))   # '3E2D1D1N1D2S6W4'
print(babciaDziunia('(3,0),(4,0)')) # 'E3D1'