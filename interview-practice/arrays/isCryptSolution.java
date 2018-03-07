boolean isCryptSolution(String[] crypt, char[][] solution) {
    // build a hashmap from crypt
    HashMap<Character, Character> solutionMap = new HashMap<Character, Character>();
    for (int i = 0; i < solution.length; i++)
        solutionMap.put(solution[i][0], solution[i][1]);

    // map each letter of each word to the corresponding digit
    String[] numbers = new String[3];
    for (int i = 0; i < 3; i++) {
        String number = "";
        for (int j = 0; j < crypt[i].length(); j++) {
            number += solutionMap.get(crypt[i].charAt(j));
        }
        numbers[i] = number;
    }

    // check if there are leading zeros
    if (Arrays.stream(numbers).anyMatch(n -> (n.charAt(0) == '0' && n.length() > 1)))
        return false;

    // check if the arithmetic equation holds
    if (Long.parseLong(numbers[0]) + Long.parseLong(numbers[1]) != Long.parseLong(numbers[2]))
        return false;

    return true;
}
