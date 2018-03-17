int kthLargestElement(int[] nums, int k) {
    class Heap {
        ArrayList<Integer> heap;

        public Heap() {
            heap = new ArrayList<Integer>();
        }

        public int getMax() {
            return this.heap.isEmpty() ? Integer.MIN_VALUE : this.heap.get(0);
        }

        public void insert(int v) {
            // add the new element
            heap.add(v);
            // up in the tree
            int index = this.heap.size() - 1;
            int parentIndex = (int)Math.floor((index - 1) / 2);
            while (v > this.heap.get(parentIndex) && parentIndex >= 0) {
                this.heap.set(index, this.heap.get(parentIndex));
                this.heap.set(parentIndex, v);
                index = parentIndex;
                parentIndex = (int)Math.floor((index - 1) / 2);
            }
        }

        public int pop() {
            int max = this.getMax();

            if (max == Integer.MIN_VALUE) return max;
            this.heap.set(0, this.heap.remove(this.heap.size() - 1));

            this.heapifyMax(0);

            return max;
        }

        public void heapifyMax(int index) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;

            int largest = index;
            if (leftChild < this.heap.size() && this.heap.get(largest) < this.heap.get(leftChild)) {
                largest = leftChild;
            }
            if (rightChild < this.heap.size() && this.heap.get(largest) < this.heap.get(rightChild)) {
                largest = rightChild;
            }

            if (largest != index) {
                int temp = this.heap.get(index);
                this.heap.set(index, this.heap.get(largest));
                this.heap.set(largest, temp);
                heapifyMax(largest);
            }
        }

    }

    Heap heap = new Heap();
    for (int num: nums) heap.insert(num);
    for (int i = 0; i < k-1; i++) heap.pop();
    return heap.getMax();
}
