int[] minimumOnStack(String[] operations) {
    Stack<Integer> values = new Stack<Integer>();
    Stack<Integer> mins = new Stack<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();

    for (String operation: operations) {
        if (operation.equals("min") && !mins.empty()) {
            result.add(mins.peek());
        } else if (operation.equals("pop")) {
            if (values.pop() == mins.peek()) {
                mins.pop();
            }
        } else {
            Integer n = Integer.parseInt(operation.substring(5));
            values.push(n);
            if (mins.empty() || n < mins.peek()) {
                mins.push(n);
            }
        }
    }

    int[] resultArray = new int[result.size()];

    for (int i = 0; i < result.size(); i++) {
        resultArray[i] = result.get(i);
    }

    return resultArray;
}
