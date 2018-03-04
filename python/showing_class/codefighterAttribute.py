class CodeFighter(object):
    def __init__(self, username, _id, xp, name):
        self.username = username
        self._id = _id
        self.xp = xp
        self.name = name

    def __getattr__(self, value):
        return value + " attribute is not defined"


def codefighterAttribute(attribute):
    codefighter = CodeFighter("annymaster", "1234567", "1500", "anny")
    return getattr(codefighter, attribute)
