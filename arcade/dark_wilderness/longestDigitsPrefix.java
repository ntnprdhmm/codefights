String longestDigitsPrefix(String input) {
    Pattern p = Pattern.compile("^([0-9]+)");
    Matcher m = p.matcher(input);
    if (m.find()) {
        return m.group(1);
    }
    return "";
}
