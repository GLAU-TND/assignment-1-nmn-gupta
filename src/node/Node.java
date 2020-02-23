package node;

public class Node<T> {
    private T data;   //  Data of node
    private Node<T> next;  //self referential data

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
