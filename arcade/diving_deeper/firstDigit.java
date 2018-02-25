char firstDigit(String input) {
    Pattern pattern = Pattern.compile("(\\d)");
    Matcher matcher = pattern.matcher(input);

    matcher.find();
    return matcher.group(1).charAt(0);
}
