package com.btcag;

public class QueueList {
    public interface dynamicArray {
        int popFront();
        int popLast();
        int pushLast(int i);
        int pushFront(int i);
        int get(int i);
    }

}
