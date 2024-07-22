package Heaps;

import java.util.*;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    public void insert(T val) {
        list.add(val);
        upheap(list.size() - 1);
    }

    private void upheap(int i) {
        if (i == 0)
            return;
        int p = parent(i);
        if ((list.get(i).compareTo(list.get(p))) < 0) {
            swap(i, p);
            upheap(p);
        }

    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Heap is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size());
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int i) {
        int min = i;
        int left = left(i);
        int right = right(i);
        if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0) {
            min = left;
        }
        if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0) {
            min = right;
        }
        if (min != i) {
            swap(min, i);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> sorted = new ArrayList<>();
        while (!list.isEmpty()) {
            sorted.add(remove());
        }
        return sorted;
    }
}
