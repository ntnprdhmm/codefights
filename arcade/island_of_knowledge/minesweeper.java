int[][] minesweeper(boolean[][] matrix) {
    int[][] output = new int[matrix.length][matrix[0].length];
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;

            if (row > 0 && col > 0 && matrix[row-1][col-1]) count += 1;
            if (row > 0 && matrix[row-1][col]) count += 1;
            if (row > 0 && col < matrix[0].length-1 && matrix[row-1][col+1]) count += 1;

            if (col > 0 && matrix[row][col-1]) count += 1;
            if (col < matrix[0].length-1 && matrix[row][col+1]) count += 1;

            if (row < matrix.length-1 && col > 0 && matrix[row+1][col-1]) count += 1;
            if (row < matrix.length-1 && matrix[row+1][col]) count += 1;
            if (row < matrix.length-1 && col < matrix[0].length-1 && matrix[row+1][col+1]) count += 1;

            output[row][col] = count;
        }
    }
    return output;
}
