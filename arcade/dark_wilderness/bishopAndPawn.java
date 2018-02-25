boolean bishopAndPawn(String bishop, String pawn) {
    int diffX = Math.abs(bishop.charAt(0) - pawn.charAt(0));
    int diffY = Math.abs(bishop.charAt(1) - pawn.charAt(1));
    return diffX == diffY;
}
