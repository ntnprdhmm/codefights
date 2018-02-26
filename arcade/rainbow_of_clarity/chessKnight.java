int chessKnight(String cell) {
    int width = 8;
    int height = 8;
    int x = ((int)cell.charAt(0)) - 97;
    int y = Integer.parseInt(String.valueOf(cell.charAt(1))) - 1;
    int counter = 0;

    if (y+2 < height && x+1 < width) counter++;
    if (y+2 < height && x-1 >= 0) counter++;
    if (y-2 >= 0 && x+1 < width) counter++;
    if (y-2 >= 0 && x-1 >= 0) counter++;

    if (y+1 < height && x+2 < width) counter++;
    if (y+1 < height && x-2 >= 0) counter++;
    if (y-1 >= 0 && x+2 < width) counter++;
    if (y-1 >= 0 && x-2 >= 0) counter++;

    return counter;
}
