int[] replaceMiddle(int[] arr) {
    if (arr.length % 2 == 1) return arr;

    int[] res = new int[arr.length-1];
    int i = 0;
    for (i = 0; i < (arr.length/2); i++) {
        res[i] = arr[i];
    }
    if (i < arr.length) {
        res[i-1] += arr[i];
    }
    while(i < (arr.length)-1) {
        res[i] += arr[i+1];
        i++;
    }
    return res;
}
