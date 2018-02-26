boolean isMAC48Address(String s) {
    Pattern p = Pattern.compile("^([0-9A-F]{2}-){5}([0-9A-F]{2})$");
    Matcher m = p.matcher(s);
    return m.find();
}
