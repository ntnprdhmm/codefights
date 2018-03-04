def urlSimilarity(url1, url2):
    from urllib.parse import urlparse
    parsed1 = urlparse(url1)
    parsed2 = urlparse(url2)
    score = 0

    if parsed1.scheme == parsed2.scheme: score += 5
    if parsed1.netloc == parsed2.netloc: score += 10

    for p1, p2 in zip(parsed1.path.split('/'), parsed2.path.split('/')):
        if p1 != p2:
            break
        score += 1

    d1 = {}
    for param in parsed1.query.split('&'):
        try:
            var, val = param.split('=')
            d1[var] = val
        except:
            pass

    for param in parsed2.query.split('&'):
        try:
            var, val = param.split('=')
            if var in d1:
                score +=1
                if d1[var] == val:
                    score += 1
        except:
            pass


    return score - 1
    
