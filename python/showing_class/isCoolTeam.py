class Team(object):
    def __init__(self, names):
        self.names = names

    def __bool__(self):
        from collections import Counter
        first = Counter(map(lambda n: n[0].lower(), self.names))
        last = Counter(map(lambda n: n[-1].lower(), self.names))
        diff = last - first
        return sum(diff.values()) <= 1

def isCoolTeam(team):
    return bool(Team(team))
