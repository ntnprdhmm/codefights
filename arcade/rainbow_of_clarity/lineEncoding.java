String appendCharCounter(String s, char c, int counter) {
    if (counter > 1) {
        s += Integer.toString(counter);
    }
    return s + c;
}

String lineEncoding(String s) {
    String encoded = "";

    char current = s.charAt(0);
    int counter = 1;

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) != current) {
            encoded = appendCharCounter(encoded, current, counter);
            current = s.charAt(i);
            counter = 0;
        }
        counter ++;
    }

    return appendCharCounter(encoded, current, counter);
}
