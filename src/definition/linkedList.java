package definition;

import node.Node;

public class linkedList<T extends Comparable<T>> {
    private Node<T> head;           //It is the beginning of linked list
    private Node<T> iter;           //It is used to iterate the list

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> node) {
        head = node;
        iter = head;
    }

    public Node<T> getIter() {
        return iter;
    }

    public void setIter(Node<T> iter) {
        this.iter = iter;
    }

    public void insert(Node<T> node) {
        if (getHead() == null) {
            setHead(node);
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

}

