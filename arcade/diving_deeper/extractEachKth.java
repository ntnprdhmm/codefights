int[] extractEachKth(int[] input, int k) {
    int nbElementsToExtract = (int)Math.floor(input.length/k);
    int[] output = new int[input.length - nbElementsToExtract];
    int j = 0;
    for (int i = 0; i < input.length; i++) {
        if ((i+1) % k != 0) {
            output[j] = input[i];
            j++;
        }
    }
    return output;
}
