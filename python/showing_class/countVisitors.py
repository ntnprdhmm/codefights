class Counter(object):
    def __init__(self, value):
        self.value = value

    def inc(self):
        self.value += 1

    def get(self):
        return self.value


def countVisitors(beta, k, visitors):
    counter = Counter(beta)
    for visitor in visitors:
        if visitor >= k:
            counter.inc()
    return counter.get()
