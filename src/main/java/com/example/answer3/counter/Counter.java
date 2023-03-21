package com.example.answer3.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count;
    private Lock lock;

    public Counter() {
        count = 0;
        lock = new ReentrantLock();
    }

    public void increment() {
        lock.lock();
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " acquired the lock");
            count++;
            System.out.println("Thread " + Thread.currentThread().getId() + " incremented the count to " + count);
        } finally {
            System.out.println("Thread " + Thread.currentThread().getId() + " released the lock");
            lock.unlock();
        }
    }
}

