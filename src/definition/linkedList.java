package definition;

import node.Node;

public class linkedList<T extends Comparable<T>> {
    private Node<T> head;           //It is the beginning of linked list
    private Node<T> next;           //It is used to iterate the list

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> node) {
        head = node;
        next = head;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void insert(Node<T> node) {
        if (getHead() == null) {
            setHead(node);
        } else {
            Node<T> temp = head;
            while (temp.getIterator() != null) {
                temp = temp.getIterator();
            }
            temp.setNext(node);
        }

    }

    //Helper method to check if linked list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    //Method to fetch object one by one
    public Node<T> getObject() {

        Node<T> temp;

        if (getNext() == null && getHead() == null) {
            System.out.println("List is empty");
            return null;
        } else if (getNext() == null) {
            setNext(getHead());
            return null;
        }
        temp = getNext();
        setNext(getNext().getIterator());
        return temp;
    }

    //method to delete node from beginning
    public Node<T> delete() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        }
        Node<T> temp = getHead();
        setHead(getHead().getIterator());
        return temp;
    }

    //method to delete node at particular position
    public Node<T> deleteFromPosition(int i) {
        Node<T> deletedNode;
        Node<T> temp = getHead();
        if (isEmpty()) {
            System.out.println("Underflow");
            return temp;
        }
        if (i == 1) {
            deletedNode = getHead();
            setHead(null);
        } else {
            for (int j = 1; j < i - 1; j++) {
                temp = temp.getIterator();
            }
            deletedNode = temp.getIterator();
            temp.setNext(temp.getIterator().getIterator());
        }
        return deletedNode;
    }

    public void sort() {
        Node<T> pass1 = getHead();


        while (pass1 != null) {
            Node<T> pass2 = getHead();


            while (pass2 != null) {
                if (pass1.getData().compareTo(pass2.getData()) < 0) {
                    T temp = pass1.getData();
                    pass1.setData(pass2.getData());
                    pass2.setData(temp);
                }
                pass2 = pass2.getIterator();
            }
            pass1 = pass1.getIterator();
        }
    }


}

