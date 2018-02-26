String longestWord(String text) {
    Pattern p = Pattern.compile("([a-zA-Z]+)");
    Matcher m = p.matcher(text);
    String longest = "";
    while (m.find()) {
        if (m.group(1).length() > longest.length()) longest = m.group(1);
    }
    return longest;
}
