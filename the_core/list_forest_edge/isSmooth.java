boolean isSmooth(int[] arr) {
    // base test
    if (arr[0] != arr[arr.length-1]) {
        return false;
    }
    // test the middle
    if (arr.length % 2 == 0) {
        return arr[0] == (arr[arr.length/2] + arr[(arr.length/2)-1]);
    }
    return arr[0] == arr[(int)Math.ceil(arr.length/2)];
}
