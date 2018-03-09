String findProfession(int level, int pos) {
    return findProfessionHelper(level, pos) == 'e' ? "Engineer" : "Doctor";
}

Character findProfessionHelper(int level, int pos) {
    // base case
    if (level == 1) return 'e';

    // check if parent is engineer or doctor
    Character parent = findProfessionHelper(level-1, (int)Math.floor((pos+1)/2));

    if (parent == 'd') {
        // if parent doctor, we know that left child id doctor, and right child is engineer
        return (pos % 2 == 0) ? 'e' : 'd';
    } else {
        // if parent engineer, we know that left is engineer and right is doctor
        return (pos % 2 == 0) ? 'd' : 'e';
    }
}
