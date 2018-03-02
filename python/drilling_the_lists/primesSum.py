def primesSum(a, b):
    return sum([v for v in range(a, b+1) if not (v < 2 or any(v % x == 0 for x in range(2, int(v**0.5 + 1))))])
