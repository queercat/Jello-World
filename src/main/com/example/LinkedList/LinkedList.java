package com.example.LinkedList;

public class LinkedList<T> {
    private LinkedList<T> next;
    private T value;

    public LinkedList(LinkedList<T> next) {
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

    public LinkedList<T> getNext() {
        return next;
    }

    public void setNext(LinkedList<T> next) {
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
