package com.example.HelloWorld;

import com.example.LinkedList.LinkedList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkedList<String> list = new LinkedList<>("0");

        var head = list;

        for (int i = 1; i < 100; ++i) {
            LinkedList<String> node = new LinkedList<>(Integer.toString(i));
            head.setNext(node);
            head = node;
        }

        list.print();
    }
}
