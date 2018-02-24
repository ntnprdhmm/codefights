boolean evenDigitsOnly(int n) {
    return Pattern.matches("(0|2|4|6|8)*", Integer.toString(n));
}
