from itertools import combinations

def crazyball(players, k):
    return sorted(list(sorted(y) for y in combinations(players, k)))
