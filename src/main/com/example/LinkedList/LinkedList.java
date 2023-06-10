package com.example.LinkedList;

public class LinkedList<T> {
    private LinkedList next;
    private T value;

    public LinkedList(LinkedList next) {
        this.next = next;
    }

    public LinkedList(T value) {
        this.value = value;
    }

    public LinkedList() {}

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public void print() {
        var node = this;

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
