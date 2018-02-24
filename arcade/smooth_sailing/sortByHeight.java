int[] sortByHeight(int[] a) {
    ArrayList<Integer> people = new ArrayList<Integer>();
    for (Integer i: a) {
        if (i != -1) {
            people.add(i);
        }
    }

    Collections.sort(people);
    int peopleIndex = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1) {
            a[i] = people.get(peopleIndex);
            peopleIndex++;
        }
    }

    return a;
}
