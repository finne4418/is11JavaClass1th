package chapter11.Practice4_1;

class Stack<E> {
    private E[] objects;
    private int sp = -1;

    private static final int DEFAULT_STACK_SIZE = 10;
    private static final int STACK_EMPTY = -1;

    @SuppressWarnings("unchecked")
    Stack() {
        objects = (E[]) new Object[DEFAULT_STACK_SIZE];
    }

    @SuppressWarnings("unchecked")
    Stack(int size) {
        objects = (E[]) new Object[size];
    }

    public void push(E data) {
        sp++;
        objects[sp] = data;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        Object o = objects[sp];
        sp--;
        return (E) o;
    }

    public void show() {
        for (int i = sp; i >= 0; i-- )
            System.out.println("[" + i + "] " + objects[i]);
    }

    public int size() {
        return objects.length;
    }

    private int getSP() {
        return sp;
    }

    public boolean isEmpty() {
        return getSP() == STACK_EMPTY;
    }

    public boolean canPush() {
        return size() - 1 > getSP();
    }

    public boolean canPop() {
        return getSP() > STACK_EMPTY;
    }
}
