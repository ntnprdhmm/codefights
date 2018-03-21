int lineUp(String commands) {
    // 2 students, 1 dumb
    // they start at the same position
    boolean pair = true;
    int count = 0;

    for (char command: commands.toCharArray()) {
        if (command == 'L' || command == 'R') {
            if (!pair) {
                // now they are in the same direction
                count++;
            }
            pair = !pair;
        } else {
            // A => nothing change
            if (pair) count++;
        }
    }

    return count;
}
