String reverseParentheses(String s) {
    int originalLength = s.length();
    int i = 0;
    while (i < originalLength) {
        if (s.charAt(i) == ')') {
            int j = i-1;
            String temp = "";
            while (s.charAt(j) != '(') {
                temp += s.charAt(j);
                j--;
            }
            // remove parentheses and reverse the substring
            s = s.substring(0, j) + temp + s.substring(i+1);
            // we removed 2 parentheses -> update i and originalLength
            i -= 2;
            originalLength -= 2;
        }
        i++;
    }
    return s;
}
