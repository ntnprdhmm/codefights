def sortByString(s, t):
    d = {}
    for c in s:
        d[c] = d[c]+1 if c in d else 1
    r = ''
    for c in t:
        if c in d:
            r += c * d[c]
    return r
