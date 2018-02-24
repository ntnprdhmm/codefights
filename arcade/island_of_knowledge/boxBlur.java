int[][] boxBlur(int[][] image) {
    int[][] output = new int[image.length - 2][image[0].length - 2];

    for (int row = 1; row < image.length-1; row++) {
        for (int col = 1; col < image[0].length-1; col++) {
            output[row-1][col-1] = (int)Math.floor((
                    image[row-1][col-1] + image[row-1][col] + image[row-1][col+1]
                    + image[row][col-1] + image[row][col] + image[row][col+1]
                    + image[row+1][col-1] + image[row+1][col] + image[row+1][col+1]
                ) / 9);
        }
    }

    return output;
}
