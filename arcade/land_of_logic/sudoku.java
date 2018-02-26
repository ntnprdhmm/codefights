boolean sudoku(int[][] grid) {
    int size = 9;
    int subSize = 3;

    // check rows and cols
    for (int i = 0; i < size; i++) {
        HashSet<Integer> setRow = new HashSet<Integer>();
        HashSet<Integer> setCol = new HashSet<Integer>();
        for (int j = 0; j < size; j++) {
            if (setRow.contains(grid[i][j]) || setCol.contains(grid[j][i])) {
                return false;
            }
            setRow.add(grid[i][j]);
            setCol.add(grid[j][i]);
        }
    }

    // check subgrids
    for (int row = 0; row < size; row+=subSize) {
        for (int col = 0; col < size; col+=subSize) {
            // for each subgrid
            HashSet<Integer> set = new HashSet<Integer>();
            for (int subRow = row; subRow < (row+subSize); subRow++) {
                for (int subCol = col; subCol < (col+subSize); subCol++) {
                    if (set.contains(grid[subRow][subCol])) {
                        return false;
                    }
                    set.add(grid[subRow][subCol]);
                }
            }
        }
    }

    return true;
}
