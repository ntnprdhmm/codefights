class Trie {
    HashMap<Character, Trie> children;
    boolean isLeaf;

    public Trie() {
        this.children = new HashMap<Character, Trie>();
        this.isLeaf = false;
    }

    public void insert(String s) {
        Trie current = this;

        for (int i = 0; i < s.length(); i++) {
            // if the current node doesn't contains the current char, add it
            if (!current.children.containsKey(s.charAt(i))) {
                current.children.put(s.charAt(i), new Trie());
            }
            // keep going
            current = current.children.get(s.charAt(i));
        }

        current.isLeaf = true;
    }

    public int search(String s, int start) {
        Trie current = this;
        int longest = 0;

        for (int i = start; i < s.length(); i++) {
            // if current char not in the children of the trie, stop
            if (!current.children.containsKey(s.charAt(i))) {
                break;
            }
            current = current.children.get(s.charAt(i));
            // if current is a leaf, we found a new part => update longest
            if (current.isLeaf) {
                longest = i - start + 1;
            }
        }

        return longest;
    }
}

String[] findSubstrings(String[] words, String[] parts) {
    // create a Trie with parts
    Trie t = new Trie();
    for (String part: parts) t.insert(part);

    // for each word, get the longest part
    for (int w = 0; w < words.length; w++) {
        int partLength = 0;
        int startIndex = 0;

        // loop through each word's character
        for (int i = 0; i < words[w].length(); i++) {
            // search the longest part from this character
            int currentLength = t.search(words[w], i);
            if (currentLength > partLength) {
                startIndex = i;
                partLength = currentLength;
            }
        }

        if (partLength > 0) {
            words[w] = words[w].substring(0, startIndex) + "["
                        + words[w].substring(startIndex, startIndex+partLength) + "]"
                        + words[w].substring(startIndex+partLength);
        }
    }

    return words;
}
