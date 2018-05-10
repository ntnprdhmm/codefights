class Cell {
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

int countClouds(char[][] skyMap) {
    int cloudCounter = 0;

    for (int row = 0; row < skyMap.length; row++) {
        for (int col = 0; col < skyMap[row].length; col++) {
            if (skyMap[row][col] == '1') {
                // we found a new cloud
                cloudCounter++;
                // erase this cloud
                LinkedList<Cell> cells = new LinkedList<Cell>();
                cells.add(new Cell(row, col));
                while (cells.size() != 0) {
                    Cell c = cells.poll();
                    skyMap[c.row][c.col] = '0';
                    if (c.row > 0 && skyMap[c.row-1][c.col] == '1') cells.add(new Cell(c.row-1, c.col));
                    if (c.row < skyMap.length-1 && skyMap[c.row+1][c.col] == '1') cells.add(new Cell(c.row+1, c.col));
                    if (c.col > 0 && skyMap[c.row][c.col-1] == '1') cells.add(new Cell(c.row, c.col-1));
                    if (c.col < skyMap[row].length-1 && skyMap[c.row][c.col+1] == '1') cells.add(new Cell(c.row, c.col+1));
                }
            }
        }
    }

    return cloudCounter;
}
