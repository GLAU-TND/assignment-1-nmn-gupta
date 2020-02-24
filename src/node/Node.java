package node;

public class Node<T> {
    private T data;   //  Data of node
    private Node<T> iterator;  //self referential data

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getIterator() {
        return iterator;
    }

    public void setNext(Node<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';

    }
}
