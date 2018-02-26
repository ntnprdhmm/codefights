int[][] spiralNumbers(int n) {

    int[][] output = new int[n][n];
    int startRow = 0, startCol = 0, i = 0;
    int endRow = n, endCol = n;
    int c = 1;

    while (startRow < endRow && startCol < endCol) {
        for (i = startCol; i < endCol; i++) {
            output[startRow][i] = c++;
        }
        // we are done with this row
        startRow++;

        for (i = startRow; i < endRow; i++) {
            output[i][endCol-1] = c++;
        }
        // we are done with this col
        endCol--;

        if (startRow < endRow) {
            for (i = endCol-1; i >= startCol; i--) {
                output[endRow-1][i] = c++;
            }
            // we are done with this row
            endRow--;
        }

        if (startCol < endCol) {
            for (i = endRow-1; i >= startRow; i--) {
                output[i][startCol] = c++;
            }
            // we are done with col
            startCol++;
        }
    }

    return output;
}
