def weirdEncoding(encoding, message):
    import base64
    data = base64.b64decode(message, encoding)
    return data.decode("utf-8")
