boolean isPalindrome(String s) {
    int middle = (int)Math.floor(s.length() / 2);
    for (int i = 0; i < middle; i++) {
        if (s.charAt(i) != s.charAt(s.length()-1-i)) {
            return false;
        }
    }
    return true;
}

String buildPalindrome(String s) {
    String suffix = "";

    int i = 0;
    while (i < s.length()) {
        if (isPalindrome(s + suffix)) break;

        suffix = s.charAt(i) + suffix;
        i++;
    }

    return s + suffix;
}
