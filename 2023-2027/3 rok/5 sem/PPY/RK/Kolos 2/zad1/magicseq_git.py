def magicseq(liczba):
    seq = [0, 1][:liczba]
    [seq.append(seq[-1] + seq[-2]) for i in range(liczba - 2)]
    return seq

print(magicseq(5))