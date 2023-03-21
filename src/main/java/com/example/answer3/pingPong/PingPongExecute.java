package com.example.answer3.pingPong;

class PingPongExecute {
    private volatile boolean pingTurn = true;

    public synchronized void playPing() {
        while (!pingTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("ping");
        pingTurn = false;
        notify();
    }

    public synchronized void playPong() {
        while (pingTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("pong");
        pingTurn = true;
        notify();
    }
}
