int[] alternatingSums(int[] a) {
    int[] answers = new int[2];
    for (int i = 0; i < a.length; i++) {
        answers[i%2] += a[i];
    }
    return answers;
}
