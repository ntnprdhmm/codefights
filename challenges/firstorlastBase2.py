def firstorlastBase2(n):
    v = n % 10
    if v == 0: v = int(str(n)[0])
    return int(bin(v)[2:])
