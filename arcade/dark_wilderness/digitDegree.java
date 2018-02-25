int digitDegree(int nb) {
    String n = Integer.toString(nb);

    int degree = 0;
    while (true) {
        // if length 1, we are done
        if (n.length() == 1) break;

        degree++;
        int v = 0;
        for (int i = 0; i < n.length(); i++) {
            v += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        n = Integer.toString(v);
    }
    return degree;
}
