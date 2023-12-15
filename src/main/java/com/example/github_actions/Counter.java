package com.example.github_actions;

public class Counter {
    private int count = 0;

    public int increment() {
        return ++count;
    }

    public int getCount() {
        return count;
    }

    public int decrement() {
        return --count;
    }

    public int reset() {
        return count = 0;
    }

    public int add(int value) {
        return count += value;
    }

    public int subtract(int value) {
        return count -= value;
    }
}
