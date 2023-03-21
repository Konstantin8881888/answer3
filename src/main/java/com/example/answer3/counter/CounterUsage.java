package com.example.answer3.counter;

public class CounterUsage {
    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 4; i++) {
            Thread counterThread = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    counter.increment();
                }
            });
            counterThread.start();
        }
    }
}
