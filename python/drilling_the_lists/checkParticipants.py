def checkParticipants(participants):
    return list(map(lambda t: t[0], filter(lambda t: t[1] < (t[0]), enumerate(participants))))
