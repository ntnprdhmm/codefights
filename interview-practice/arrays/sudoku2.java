boolean sudoku2(char[][] grid) {
    int subgridSize = 3;
    char defaultChar = '.';

    // test each rows and cols
    for (int i = 0; i < grid.length; i++) {
        HashSet<Character> colSet = new HashSet<Character>();
        HashSet<Character> rowSet = new HashSet<Character>();
        for (int j = 0; j < grid.length; j++) {
            if (colSet.contains(grid[j][i]) || rowSet.contains(grid[i][j]))
                return false;
            if (grid[j][i] != defaultChar) colSet.add(grid[j][i]);
            if (grid[i][j] != defaultChar) rowSet.add(grid[i][j]);
        }
    }

    // test each subgrid
    for (int row = 0; row < grid.length; row+=subgridSize) {
        for (int col = 0; col < grid.length; col+=subgridSize) {
            // test a subgrid
            HashSet<Character> subgridSet = new HashSet<Character>();
            for (int subRow = 0; subRow < subgridSize; subRow++) {
                for (int subCol = 0; subCol < subgridSize; subCol++) {
                    if (subgridSet.contains(grid[row+subRow][col+subCol]))
                        return false;
                    if (grid[row+subRow][col+subCol] != defaultChar) subgridSet.add(grid[row+subRow][col+subCol]);
                }
            }
        }
    }

    return true;
}
