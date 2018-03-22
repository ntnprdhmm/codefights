int[] removeArrayPart(int[] arr, int l, int r) {
    int[] res = new int[arr.length - (r-l+1)];
    int i = 0;
    for (int j = 0; j < arr.length; j++) {
        if (j < l || j > r) {
            res[i] = arr[j];
            i++;
        }
    }
    return res;
}
