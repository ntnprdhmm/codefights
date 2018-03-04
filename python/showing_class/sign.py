class Functions(object):
    @staticmethod
    def sign(x):
        if x == 0: return 0
        return 1 if x > 0 else -1

def sign(x):
    return Functions.sign(x)
