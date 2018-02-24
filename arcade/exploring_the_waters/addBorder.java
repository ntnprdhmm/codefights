String repeatString(String s, int times) {
    String temp = "";
    while (times-- > 0) {
        temp += s;
    }
    return temp;
}

String[] addBorder(String[] picture) {
    // add top and bottom borders
    String[] output = new String[picture.length + 2];
    output[0] = repeatString("*", picture[0].length()+2);
    output[output.length-1] = output[0];

    // copy the original strings and add borders around them
    for (int i = 1; i < output.length-1; i++) {
        output[i] = "*" + picture[i-1] + "*";
    }

    return output;
}
