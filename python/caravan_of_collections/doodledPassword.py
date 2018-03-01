from collections import deque

def doodledPassword(digits):
    n = len(digits)
    res = [deque(digits) for _ in range(n)]
    deque(map(lambda enum: enum[1].rotate(-enum[0]), enumerate(res)), 0)
    return [list(d) for d in res]
