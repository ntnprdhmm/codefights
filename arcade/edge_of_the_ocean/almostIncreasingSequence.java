boolean almostIncreasingSequence(int[] sequence) {
  boolean removed = false;
  int pp = -1000000;
  int p = sequence[0];

  for (int i = 1; i < sequence.length; i++) {
    if (p >= sequence[i]) {
      if (removed) {
        return false;
      }
      removed = true;
      // "remove" previous if possible because it's greater than sequence[i]
      p = (sequence[i] > pp) ? sequence[i] : p;
    } else {
      pp = p;
      p = sequence[i];
    }
  }

  return true;
}
