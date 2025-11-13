package java_collection;

public class CircularBuffer {
    private int[] buffer;
    private int size, head = 0, count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void add(int value) {
        buffer[(head + count) % size] = value;
        if (count < size) count++;
        else head = (head + 1) % size;
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % size]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1); cb.add(2); cb.add(3);
        cb.display();     // [1, 2, 3]
        cb.add(4);
        cb.display();     // [2, 3, 4]
    }
}
