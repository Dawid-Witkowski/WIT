def big_litera(litera, wiersz):
    wzorzec = {i: "".join(chr(32) if ((i + 1) // (2 ** j)) % 2 == 0 else chr(9608) for j in (2, 1, 0)) for i in range(7)}

    # Skrócony kod definicji wzorców
    wzorzec_map = {
        'A': [1, 6, 4], 'B': [5, 6, 6], 'D': [5, 4, 5], 'G': [5, 4, 6],
        'J': [0, 4, 6], 'K': [4, 5, 4], 'L': [3, 3, 6], 'N': [6, 4, 4],
        '1': [5, 1, 6], '3': [6, 2, 6], '4': [4, 6, 0], '6': [3, 6, 6],
        '7': [6, 0, 0], '8': [2, 6, 6]
    }

    #te litery, które mają dwie pierwsze linijki takie same, ale trzecią inną
    wspolne_wzorce = {
        ('I', 'T'): [[6, 1], 6, 1], ('C', 'R'): [[6, 3], 6, 3], ('M', 'P'): [[6, 6], 4, 3],
        ('W', 'H'): [[4, 6], 6, 4], ('X', 'Y'): [[4, 1], 4, 1], ('E', 'F'): [[6, 5], 6, 3],
        ('U', 'V'): [[4, 4], 6, 1]
    }

    for (l1, l2), (base, v1, v2) in wspolne_wzorce.items(): wzorzec_map[l1], wzorzec_map[l2] = base + [v1], base + [v2]

    # Definiowanie znaków, które tak samo wyglądają
    dod_wzorce = {
        ('O', '0'): [6, 4, 6], ('Q', '9'): [6, 6, 0],
        ('S', '5'): [2, 1, 5], ('Z', '2'): [5, 1, 2]
    }
    
    for litery, indeksy in dod_wzorce.items():
        for lit in litery:
            wzorzec_map[lit] = indeksy

    return [wzorzec[i] for i in wzorzec_map[litera]][wiersz - 1]

print('\n')
for char in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789':
    print(big_litera(char, 1))
    print(big_litera(char, 2))
    print(big_litera(char, 3))
    print('\n')
