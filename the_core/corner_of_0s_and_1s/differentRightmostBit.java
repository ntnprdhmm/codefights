int differentRightmostBit(int n, int m) {
  return (m^n) & (-(m^n));
}
