def simplifyPath(path):
    parts = path.split('/')
    simplified_path = []

    for part in parts:
        if part == '..':
            if len(simplified_path) > 0:
                simplified_path.pop()
        elif part != '.' and part != '':
            simplified_path.append(part)

    return '/' + '/'.join(simplified_path)
