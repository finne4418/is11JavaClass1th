package chapter11.Practice4_2;

class Queue<E> {
    private E[] objects;
    /* デフォルトのキューのサイズ:10個の要素を格納可能 */
    private static final int DEFAULT_SIZE = 11;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    @SuppressWarnings("unchecked")
    Queue() {
        objects = (E[]) new Object[DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    Queue(int size) {
        objects = (E[]) new Object[size];
    }

    private int next(int num) {
        if (num < objects.length - 1) {
            return ++num;
        }
        else {
            return 0;
        }
    }

    public void enqueue(E data) {
        objects[rear] = data;
        rear = next(rear);
        size++;
    }

    public E dequeue() {
        E e = objects[front];
        front = next(front);
        size--;
        return e;
    }

    public void show() {
        int counter = 0;
        for (int i = front; i != rear; i = next(i)) {
            System.out.println("[" + counter + "] " + objects[i]);
            counter++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return front == next(rear);
    }
}
