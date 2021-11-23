package com.javaassignments.assignment10;

import java.util.NoSuchElementException;

class SListIterator<Type> {
    private Node current;
    private Node head;

    SListIterator(Node head) {
        this.current = head;
        this.head = head;
    }

    public boolean hasNext() {
        return (current.next != null);
    }

    public Node retCurrent() {
        return this.current;
    }

    public void setCurrent() {
        this.current=head;
    }

    public Node next() {
        if (hasNext()) {
            current = current.next;
        } else {
            throw new NoSuchElementException();
        }
        return current;
    }
    public void remove() {
        // remove the curr element.
        if (current != null) {
            Node temp = head;
            if (temp == current) {
                current = current.next;
            } else {
                while (temp.next != current) {
                    temp = temp.next;
                }
                // remove the current
                temp.next = current.next;
                // update the current
                current = temp;
            }
        }
    }

    public void add(Type ele) {
        if (head == null) {
            head = new Node(ele);
            current = head;
        } else {
           Node lastNode=head;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }
            Node temp = new Node(ele);
            lastNode.next=temp;
            lastNode=temp;
        }
    }
}