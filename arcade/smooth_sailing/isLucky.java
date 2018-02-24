boolean isLucky(int n) {
    String nb = Integer.toString(n);
    int sum = 0;

    for (int i = 0; i < nb.length()/2; i++) {
        sum = sum + nb.charAt(i) - nb.charAt(nb.length() - 1 - i);
    }

    return sum == 0;
}
