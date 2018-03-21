int rounders(int value) {
    String s = Integer.toString(value);
    int[] digits = new int[s.length()+1];

    for (int i = 0; i < s.length(); i++) {
        digits[i+1] = Character.getNumericValue(s.charAt(i));
    }

    for (int i = 0; i < digits.length-2; i++) {
        if (digits[digits.length-i-1] != 0) {
            if (digits[digits.length-i-1] >= 5) {
                digits[digits.length-i-2]++;
            }
            digits[digits.length-i-1] = 0;
        }
    }

    return arrayToInt(digits);
}

public int arrayToInt(int[] a) {
    String s = "";
    for (int i = 0; i < a.length; i++) {
        s += a[i];
    }
    return Integer.parseInt(s);
}
