boolean chessBoardCellColor(String cell1, String cell2) {
    int xDiff = Math.abs(cell1.charAt(0) - cell2.charAt(0));
    int yDiff = Math.abs(cell1.charAt(1) - cell2.charAt(1));
    return (xDiff + yDiff) % 2 == 0;
}
