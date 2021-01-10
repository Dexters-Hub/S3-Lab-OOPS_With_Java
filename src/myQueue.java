import java.util.Arrays;

public class myQueue {
    private int[] items;
    private int rear;
    private int count;
    private int front;

    public myQueue() {
        int DEFAULT_SIZE = 5;
        items = new int[DEFAULT_SIZE];
    }

    public myQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length) {
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public void display(){
        System.out.println(Arrays.toString(items));
    }


    public static void main(String[] args) {
        myQueue queue = new myQueue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();

    }
}