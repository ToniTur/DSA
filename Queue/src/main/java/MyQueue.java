public class MyQueue<E> implements Queue<E> {

    private E[] data;
    private int p;

    public MyQueue(int len){
        this.data = (E[])new Object[len];
        this.p = 0;
    }

    public void push(E e) throws FullQueueException {

        if (this.FullQueue()) {
            throw new FullQueueException();
        }
        this.data[this.p++] = e;
    }

    public E pop() throws EmptyQueueException {
        if(this.EmptyQueue()) {
            throw new EmptyQueueException();
        }
        E ret = this.data[0];

        for (int i=0; i<this.p; i++){
            this.data[i] = this.data[i++];
        }
        this.p--;
        return ret;
    }

    private boolean FullQueue() {
        return this.p>=this.data.length;
    }

    private boolean EmptyQueue() {
        return this.p == 0;
    }

    public int size() {
        return this.p;
    }
}
