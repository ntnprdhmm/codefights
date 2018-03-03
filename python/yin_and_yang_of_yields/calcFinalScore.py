def calcFinalScore(scores, n):
    gen = iter(list(map(lambda x: x**2, sorted(scores, reverse=True))))

    res = 0
    try:
        for _ in range(n):
            res += next(gen)
    except StopIteration:
        res /= 5

    return res
