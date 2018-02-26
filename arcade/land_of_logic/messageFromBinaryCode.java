String messageFromBinaryCode(String code) {
    String r = "";
    for (int i = 0; i < code.length(); i+=8) {
        r += (char)Integer.parseInt(code.substring(i, i+8), 2);
    }
    return r;
}
