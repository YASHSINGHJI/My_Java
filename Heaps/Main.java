package Heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(23);
        heap.insert(89);
        heap.insert(76);
        System.out.println(heap.remove());
    }
}
