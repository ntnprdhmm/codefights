boolean reachNextLevel(int experience, int threshold, int reward) {
    return (experience + reward) - threshold >= 0;
}
