int matrixElementsSum(int[][] matrix) {
  int nbRows = matrix.length;
  int nbCols = matrix[0].length;
  int total = 0;
  for (int col = 0; col < nbCols; col++) {
    for (int row = 0; row < nbRows; row++) {
      if (matrix[row][col] == 0) {
        break;
      }
      total += matrix[row][col];
    }
  }
  return total;
}
