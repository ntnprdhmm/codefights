int lateRide(int n) {
    return addTwoDigits((int)n/60) + addTwoDigits((int)n%60);
}

int addTwoDigits(int n) {
    return n/10 + n%10;
}
