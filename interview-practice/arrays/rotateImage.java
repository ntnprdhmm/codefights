int[][] rotateImage(int[][] a) {
    int size = a.length;
    // for each layer
    for (int layer = 0; layer < Math.ceil(a.length/2); layer++) {
        // rotate each cell
        for (int i = layer; i < size-layer-1; i++) {
            // save top left
            int temp = a[layer][i];
            // replace top left by bottom left
            a[layer][i] = a[size-1-i][layer];
            // replace bottom left by bottom right
            a[size-1-i][layer] = a[size-1-layer][size-1-i];
            // replace bottom right by top right
            a[size-1-layer][size-1-i] = a[i][size-1-layer];
            // replace top right by temp value
            a[i][size-1-layer] = temp;
        }
    }
    return a;
}
