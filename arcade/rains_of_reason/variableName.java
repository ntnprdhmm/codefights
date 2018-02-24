String alphabeticShift(String s) {
    String answer = "";
    for (int i = 0; i < s.length(); i++) {
        int next = (s.charAt(i)+1);
        if (next == 123) {
            next = 97;
        }
        answer += (char)next;
    }
    return answer;
}
