int growingPlant(int upSpeed, int downSpeed, int height) {
    // first day
    height -= upSpeed;
    int count = 1;
    // count how many nights + days are needed
    if (height > 0) {
        count += (int)Math.ceil(height / (double)(upSpeed - downSpeed));
    }
    return count;
}
