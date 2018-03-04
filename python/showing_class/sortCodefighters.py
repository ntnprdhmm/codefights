def sortCodefighters(codefighters):
    res = [CodeFighter(*codefighter) for codefighter in codefighters]
    res.sort(reverse=True)
    return list(map(str, res))

class CodeFighter(object):
    def __init__(self, username, id, xp):
        self.username = username
        self.id = int(id)
        self.xp = int(xp)

    def __lt__(self, other):
        if self.xp == other.xp:
            return self.id > other.id
        return self.xp < other.xp

    def __str__(self):
        return self.username
