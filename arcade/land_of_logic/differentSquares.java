int differentSquares(int[][] m) {
    HashSet<String> set = new HashSet<String>();

    for (int r = 0; r < m.length-1; r++) {
        for (int c = 0; c < m[r].length-1; c++) {
            set.add(Integer.toString(m[r][c]) +
                    Integer.toString(m[r+1][c]) +
                    Integer.toString(m[r+1][c+1]) +
                    Integer.toString(m[r][c+1])
                   );
        }
    }

    return set.size();
}
