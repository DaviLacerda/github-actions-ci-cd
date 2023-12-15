package com.example.github_actions;

import org.junit.jupiter.api.Test;

public class CounterTest {
    @Test
    public void testIncrement() {
        Counter counter = new Counter();
        assert counter.increment() == 1;
    }

    @Test
    public void testDecrement() {
        Counter counter = new Counter();
        assert counter.decrement() == -1;
    }

    @Test
    public void testReset() {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        assert counter.reset() == 0;
    }

    @Test
    public void testGetCount() {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        assert counter.getCount() == 2;
    }

    @Test
    public void testAdd() {
        Counter counter = new Counter();
        counter.add(5);
        assert counter.getCount() == 5;
    }

    @Test
    public void testSubtract() {
        Counter counter = new Counter();
        counter.subtract(5);
        assert counter.getCount() == -5;
    }
}
