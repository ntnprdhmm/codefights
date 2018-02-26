int sumUpNumbers(String s) {
    Pattern p = Pattern.compile("([0-9]+)");
    Matcher m = p.matcher(s);
    int sum = 0;
    while (m.find()) {
       sum += Integer.parseInt(m.group(1));
    }
    return sum;
}
