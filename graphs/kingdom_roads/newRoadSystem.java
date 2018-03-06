boolean newRoadSystem(boolean[][] roadRegister) {
    int[] sumRows = new int[roadRegister.length];
    int[] sumCols = new int[roadRegister.length];
    for (int row = 0; row < roadRegister.length; row++) {
        for (int col = 0; col < roadRegister[row].length; col++) {
            sumRows[row] += roadRegister[row][col] ? 1 : 0;
            sumCols[col] += roadRegister[row][col] ? 1 : 0;
        }
    }
    return Arrays.equals(sumRows, sumCols);
}
