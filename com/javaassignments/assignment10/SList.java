package com.javaassignments.assignment10;

public class SList<Type> {
    private Node head;
    private SListIterator iterator;

    public SList() {
        this.iterator = new SListIterator(head);
    }

    public SListIterator getIterator() {
        // set the curr
        this.iterator.setCurrent();
        return iterator;
    }

    public String toString() {
        String out = " ";
        while (iterator.hasNext()) {
            out += iterator.retCurrent().data + " -> ";
            iterator.next();
        }
        return out + iterator.retCurrent().data;
    }

    public static void main(String[] args) {
        SList<Integer> sList = new SList<>();
        sList.getIterator().add(1);
        sList.getIterator().add(2);
        sList.getIterator().add(3);
        sList.getIterator().add(4);
        sList.getIterator().add(5);
        System.out.println(sList.toString());
        sList.getIterator().remove();
        System.out.println(sList.toString());
    }
}