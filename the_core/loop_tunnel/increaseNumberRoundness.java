boolean increaseNumberRoundness(int n) {
    boolean foundZero = false;
    String s = Integer.toString(n);
    for (char c: s.toCharArray()) {
        if (c != '0' && foundZero) {
            return true;
        } else if (c == '0') {
            foundZero = true;
        }
    }
    return false;
}
