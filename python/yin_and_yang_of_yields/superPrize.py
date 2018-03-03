class Prizes(object):
    def __init__ (self, purchases, n , d):
        self.i = n-1
        self.purchases = purchases
        self.n = n # step
        self.d = d

    def __iter__(self):
        return self

    def __next__(self):
        r = None
        while not r and self.i < len(self.purchases):

            if self.purchases[self.i] % self.d == 0:
                r = self.i + 1
            self.i += self.n


        if not r:
            raise StopIteration
        return r


def superPrize(purchases, n, d):
    return list(Prizes(purchases, n, d))
