import java.util.ArrayList;

class MinHeap {
    private ArrayList<Integer> heap = new ArrayList<>();

    public void offer(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }

    public int peek() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    public int poll() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return root;
    }

    private void heapifyUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else break;
        }
    }

    private void heapifyDown(int i) {
        int size = heap.size();
        while (i < size) {
            int left = 2 * i + 1, right = 2 * i + 2, smallest = i;
            if (left < size && heap.get(left) < heap.get(smallest)) smallest = left;
            if (right < size && heap.get(right) < heap.get(smallest)) smallest = right;
            if (smallest != i) {
                swap(i, smallest);
                i = smallest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
